import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ScientificCalculatorTest {

    private val calculator = Calculator()

    @Test
    fun testSimpleAddition() {
        val result = calculator.evaluate("1 + 1")
        assertEquals(2.0, result)
    }

    @Test
    fun testSimpleSubtraction() {
        val result = calculator.evaluate("5 - 3")
        assertEquals(2.0, result)
    }

    @Test
    fun testSimpleMultiplication() {
        val result = calculator.evaluate("4 * 2")
        assertEquals(8.0, result)
    }

    @Test
    fun testComplexExpression() {
        val result = calculator.evaluate("(1 + 2) * 3 - 4")
        assertEquals(5.0, result)
    }

    @Test
    fun testExpressionWithParentheses() {
        val result = calculator.evaluate("((2 + 3) * 2) - (3 * 1)")
        assertEquals(7.0, result)
    }
}
