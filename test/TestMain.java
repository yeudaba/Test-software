import TDD.WhiteBox;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class TestMain {
    @Test
    public void testArray_and_Size(){
        int []arr0 = new int [0];
        int size0=0;
        assertTrue(WhiteBox.sumPositive(arr0,size0)==0,"pass");
    }

}
