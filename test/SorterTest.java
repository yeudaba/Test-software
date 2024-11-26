import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import TDD.*;

//a
public class SorterTest {
    @Test
    public void testMergeSort() {
        Employee[] employees = EmployeeArray.generateEmployees(1000);// יצירת מערך של 1000 עובדים
        Employee[] sortedEmployees = Sorter.mergeSort(employees);// פה אני מבצע מיון למערך

        // Check if sorted
        for (int i = 1; i < sortedEmployees.length; i++) {// בלולאה אני מוודא שהמערך ממוין לפי משכורת
            //  הלולאה מתחילה מהאיבר השני (אינדקס 1) ומשווה כל משכורת למשכורת הקודמת לה.
            assertTrue(sortedEmployees[i - 1].getSalary() <= sortedEmployees[i].getSalary(), "Array is not sorted");//  בודקים שהמשכורת של העבוד הנוכחי גדולה או שוווה למשכורת של העובד הקודם, השימוש בassertTrue אם במקרה שבו התנאי אינו מתקיים (כלומר המערך לא ממוין),הבדיקה תיכשל ותציג הודעה נציג הודעה שהמערך לא ממוין
        }
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }
    }

    @Test
    public void testNonEmptyArray() {
        Employee[] employees = EmployeeArray.generateEmployees(1000);// יצירת מערך של 100 עובדים
        Employee[] sortedEmployees = Sorter.mergeSort(employees);// פה אני מבצע מיון למערך
        assertNotNull(sortedEmployees, "Sorted array should not be null");// בדיקה זו מוודאת שהמערך המוחזר sortedEmployees אינו null.
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }
    }
}
