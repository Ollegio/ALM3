fun main(args: Array<String>) {
    val expression = readLine()!!
    val rpn: String
    if (ExpressionParser.checkExpression(expression)) {
        rpn = ExpressionParser.sortingStation(expression)
    } else {
        println("Ошибка в выражении")
        return
    }

    println("Обратная польская нотация: $rpn")
    println("\tРезультат " + ExpressionParser.calculateExpression(expression))
}