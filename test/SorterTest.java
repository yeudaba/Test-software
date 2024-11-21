import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SorterTest {
    @Test
    public void testMergeSort() {
        Employee[] employees = EmployeeArray.generateEmployees(100);
        Employee[] sortedEmployees = Sorter.mergeSort(employees);

        // Check if sorted
        for (int i = 1; i < sortedEmployees.length; i++) {
            assertTrue(sortedEmployees[i - 1].getSalary() <= sortedEmployees[i].getSalary(), "Array is not sorted");
        }
    }

    @Test
    public void testNonEmptyArray() {
        Employee[] employees = EmployeeArray.generateEmployees(100);
        Employee[] sortedEmployees = Sorter.mergeSort(employees);
        assertNotNull(sortedEmployees, "Sorted array should not be null");
    }
}
