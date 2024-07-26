import java.util.*

class ShuntingYard {
    private val operators = setOf('+', '-', '*')
    private val precedence = mapOf('+' to 1, '-' to 1, '*' to 2)

    fun toPostfix(tokens: List<String>): Queue<String> {
        val outputQueue = LinkedList<String>()
        val operatorStack = Stack<String>()

        for (token in tokens) {
            when {
                token.isDouble() -> outputQueue.add(token)
                token.isOperator() -> {
                    while (operatorStack.isNotEmpty() && operatorStack.peek() != "(" &&
                        operatorStack.peek().isOperator() &&
                        precedence[token[0]]!! <= precedence[operatorStack.peek()[0]]!!) {
                        outputQueue.add(operatorStack.pop())
                    }
                    operatorStack.push(token)
                }
                token == "(" -> operatorStack.push("(")
                token == ")" -> {
                    while (operatorStack.peek() != "(") {
                        outputQueue.add(operatorStack.pop())
                    }
                    operatorStack.pop()
                }
            }
        }
        while (operatorStack.isNotEmpty()) {
            outputQueue.add(operatorStack.pop())
        }
        return outputQueue
    }

    private fun String.isDouble(): Boolean = this.toDoubleOrNull() != null
    private fun String.isOperator(): Boolean = this.length == 1 && this[0] in operators
}
