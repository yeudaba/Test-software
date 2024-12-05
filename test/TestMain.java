import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestMain {
    @Test

    //מסלול 1
    public void testArray_and_Size0() {
        // בדיקה למערך ריק
        int[] arr0 = new int[0]; // מערך ריק
        int size0 = 0; // גודל המערך הוא 0
        assertEquals(1, TDD.WhiteBox.sumPositive(arr0, size0), "הפונקציה צריכה להחזיר 0 כאשר המערך ריק");
    }
    // מסלול 2
    @Test
    public void testArray_and_Size1() {
        int [] arr1 = new int[5];
        int size1 = 5;
        for(int i = 0; i < size1; i++) {
            arr1[i] = i;
        }
        assertEquals(10,TDD.WhiteBox.sumPositive(arr1, size1));
    }
    // מסלול 3 וגם מסלול4
    @Test
    public void testArray_and_Size2() {
        int [] arr2 = new int[5];
        int size2 = 5;
        for(int i = 0; i < size2; i++) {
            arr2[i] = -i;
        }
        assertEquals(0,TDD.WhiteBox.sumPositive(arr2, size2));
    }
    @Test
    public void testArray_and_Size3() {
        int [] arr3 = new int[5];
        int size3 = 5;
        for(int i = 0; i < size3; i++) {
            if(i%2==0){
                arr3[i] = i;
            }
            else
                arr3[i]=-i;
        }
        assertEquals(6,TDD.WhiteBox.sumPositive(arr3,size3));
    }
}
