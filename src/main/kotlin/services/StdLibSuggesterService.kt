package services

import java.io.File
import java.util.jar.JarFile

class StdLibSuggesterService {
    private val classList = getStdLibClasses()

    private fun findKotlinStdLib() : String? {
        val classpath : String = System.getProperty("java.class.path")

        return classpath
            .split(File.pathSeparator)
            .find { it.contains("kotlin-stdlib") && it.endsWith(".jar")}
    }

    private fun getStdLibClasses() : List<String> {
        val path = findKotlinStdLib()

        return JarFile(path).use { jarFile ->
            jarFile.entries()
                .asSequence()
                .map {it.name}
                .filter { it.endsWith(".class") && it.startsWith("kotlin/") }
                .map {it.replace("/", ".")}
                .toList()
        }
    }

    fun getSuggestionsByPrefix(prefix: String) : List<String> {
        return classList.filter { it.substringAfterLast(".").contains(prefix) }
    }
}
