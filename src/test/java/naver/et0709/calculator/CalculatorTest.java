package naver.et0709.calculator;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private Calculator calculator = new Calculator();
    @Test
    public void testSum(){
        assertEquals(5, calculator.sum(2, 3));
    }
}
