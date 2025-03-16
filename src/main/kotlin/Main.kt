import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.core.main
import services.StdLibSuggesterService

class StdLibSuggesterCLI: CliktCommand() {
    private val suggesterService = StdLibSuggesterService()

    override fun run() {
        echo("Please insert your prefix: ")
        val input : String = readln()

        suggesterService.getSuggestionsByPrefix(input).forEach(::println)
    }
}

fun main(args: Array<String>) = StdLibSuggesterCLI().main(args)
