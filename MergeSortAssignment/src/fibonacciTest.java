import org.junit.Test;

import static org.junit.Assert.*;

public class fibonacciTest {

    @Test
    public void ninthFibReturns34(){
        assertEquals(34, Main.fibonacci(9));
    }
    @Test
    public void zeroFibReturns0(){
        assertEquals(0, Main.fibonacci(0));
    }

    @Test
    public void twentyFibReturns6765(){
        assertEquals(6765, Main.fibonacci(20));
    }

}