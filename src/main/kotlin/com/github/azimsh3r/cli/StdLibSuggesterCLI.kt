package com.github.azimsh3r.cli

import com.github.azimsh3r.core.StdLibSuggesterService
import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.core.main
import com.github.ajalt.clikt.parameters.arguments.argument

class StdLibSuggesterCLI : CliktCommand(name = "suggest") {
    private val prefix by argument(help = "Prefix to search for")

    private val suggesterService = StdLibSuggesterService()

    override fun run() {
        val suggestions = suggesterService.getSuggestionsByPrefix(prefix)
        if (suggestions.isEmpty()) {
            echo("No suggestions found for prefix: \"$prefix\"")
        } else {
            suggestions.forEach(::println)
        }
    }
}

fun main(args: Array<String>) = StdLibSuggesterCLI().main(args)