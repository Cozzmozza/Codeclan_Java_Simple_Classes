import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    Calculator calculator;
    int testNumber1 = 10;
    int testNumber2 = 5;

    @Before
    public void before() {
        calculator =  new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(15, calculator.add(testNumber1, testNumber2));
    }

    @Test
    public void canSubtract() {
        assertEquals(5, calculator.subtract(testNumber1, testNumber2));
    }

    @Test
    public void canMultiply(){
        assertEquals(50, calculator.multiply(testNumber1, testNumber2));
    }

    @Test
    public void canDivide(){
        assertEquals(5.25, calculator.divide(10.5, 2.0));
    }
}
