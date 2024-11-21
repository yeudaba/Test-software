import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class FibonacciTest {
    @Test
    public void testAdition(){
        assertEquals(4,2+2);

    }

    @Test
    public void testFibonacci(){
        FibonacciCalc calc=new FibonacciCalc();
        assertEquals(5,calc.fibu(5));
    }

}   
