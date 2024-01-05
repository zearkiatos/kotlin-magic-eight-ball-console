import constants.answers.*

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
fun main(args: Array<String>) {

    println("Hello I'm your eight magic ball🎱. Which of these options do you want to do?")
    println("1. I want to make a question")
    println("2. I want to check all the answer")
    println("3. Salir")

    val input = readLine()

    when(input) {
        "1" -> makeAQuestion()
        "2" -> showAnswer()
        "3" -> exit()
        else -> showAnError()
    }
}

fun makeAQuestion() {
    println("What question do you want to make?")
    readLine()
    println("Then that was your question... the answer is")
    val answerGenerated = answers.keys.random()
    println(answerGenerated)
}

fun showAnswer() {
    println("Select an option")
    println("1. Check all answer")
    println("2. Only check the affirmative answers")
    println("3. Checking only the doubtful answers")
    println("4. Checking only the negative answers")

    val optionTyped = readLine()

    when(optionTyped) {
        "1" -> showAnswerByType()
        "2" -> showAnswerByType(type=AFFIRMATIVE_ANSWER)
        "3" -> showAnswerByType(type=NEGATIVE_ANSWER)
        "4" -> showAnswerByType(type=DOUBTFUL_ANSWER)
        else -> println("No valid answer. Goodbye")
    }
}

fun showAnswerByType(type: String = ALL) {
    val keyPrinter: (Map<String, String>)->Unit = {answers -> println(answers.keys)}
    when(type) {
        ALL->answers.keys.forEach{ answer -> println(answer) }
        AFFIRMATIVE_ANSWER -> answers.filterValues { value -> value == AFFIRMATIVE_ANSWER }
            .also (keyPrinter)
        NEGATIVE_ANSWER -> answers.filterValues { value -> value == NEGATIVE_ANSWER }
            .also(keyPrinter)
        DOUBTFUL_ANSWER -> answers.filterValues { value -> value == DOUBTFUL_ANSWER }
            .also(keyPrinter)
    }
}

fun exit() {
    println("Goodbye 👋")
}

fun showAnError() {
    println("Ups! you chose an invalid answer 🤯")
}