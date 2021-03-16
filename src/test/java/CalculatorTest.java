import org.junit.Before;
import org.junit.Test;

import  static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(16 + 4, 16 - 4, 16 * 4, 16.0 / 4.0);
    }

    @Test
    public void getAddition(){
        assertEquals(20, calculator.canAdd());
    }

    @Test
    public void getSubtraction(){
        assertEquals(12, calculator.canSubtract());
    }

    @Test
    public void getMultiplication(){
        assertEquals(64, calculator.canMultiply());
    }

    @Test
    public void getDivision(){
        assertEquals(4, calculator.canDivide(), 0.0);
    }
}
