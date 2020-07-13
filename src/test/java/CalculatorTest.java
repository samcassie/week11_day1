import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calc;
    @Before
    public void before(){
        calc = new Calculator();
    }

    @Test
    public void add(){
        assertEquals(3, calc.add(2,1));
    }

    @Test
    public void subtract(){
        assertEquals(5, calc.subtract(10,5));
    }

    @Test
    public void mutiply(){
        assertEquals(8, calc.multiply(4,2));
    }

    @Test
    public void divide(){
        assertEquals(6, calc.divide(18,3), 0.1);
    }

}
