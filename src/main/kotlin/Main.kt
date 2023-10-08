import constants.answers.*

fun main(args: Array<String>) {
    val answers = mapOf(
        "Yes" to AFFIRMATIVE_ANSWER,
        "It is true" to AFFIRMATIVE_ANSWER,
        "Totally" to AFFIRMATIVE_ANSWER,
        "Without doubt" to AFFIRMATIVE_ANSWER,
        "Ask me in another time" to DOUBTFUL_ANSWER,
        "I cannot tell you in this moment" to DOUBTFUL_ANSWER,
        "It might yes or not" to DOUBTFUL_ANSWER,
        "It is not going to happen" to NEGATIVE_ANSWER,
        "Don't count with that" to NEGATIVE_ANSWER,
        "Definitely not" to NEGATIVE_ANSWER,
        "I don't believe that" to NEGATIVE_ANSWER
    )

    println("Hello I'm your eight magic ball🎱. Which of these options do you want to do?")
    println("1. I want to make a question")
    println("2. I want to check all the answer")
    println("3. Salir")

    val input = readLine()

    when(input) {
        "1" -> makeAQuestion()
        "2" -> showAnswer()
        "3" -> salir()
        else -> showAnError()
    }

}