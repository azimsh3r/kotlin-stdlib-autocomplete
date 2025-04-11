package com.github.azimsh3r.core

import java.io.File
import java.util.jar.JarFile

class StdLibSuggesterService {
    fun getSuggestionsByPrefix(prefix: String): List<String> {
        return getStdLibClasses()
            .map { it.removeSuffix(".class") }
            .filter { it.startsWith("kotlin.collections") and it.substringAfterLast(".").contains(prefix) }
    }

    private fun findKotlinStdLib(): String? {
        val classpath: String = System.getProperty("java.class.path")
        return classpath
            .split(File.pathSeparator)
            .find { it.contains("kotlin-stdlib") && it.endsWith(".jar") }
    }

    private fun getStdLibClasses(): List<String> {
        val path = findKotlinStdLib()

        if (path == null) {
            println("Kotlin stdlib not found in classpath.")
            return emptyList()
        }

        return JarFile(path).use { jarFile ->
            jarFile.entries()
                .asSequence()
                .map { it.name }
                .filter { it.endsWith(".class") && it.startsWith("kotlin/") }
                .map { it.replace("/", ".") }
                .toList()
        }
    }
}
