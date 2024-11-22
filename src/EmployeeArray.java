import java.util.Random;


// אובייקט של מערך של עובדים
public class EmployeeArray {
    private static Employee [] employees;
    private static int size;

    public EmployeeArray(int capacity){
        employees = new Employee[capacity];
        size=0;
        generateEmployees(capacity);
    }
    // פונקציה שהמטרה שלה היא ליצור באופן רנדומלי 1000 עובדים עם פרטים אישיים במערך
    public static Employee[] generateEmployees(int count) {
        Random random = new Random();
        Employee[] employees = new Employee[count];

        for (int i = 0; i < count; i++) {
            String id = String.valueOf(1000 + random.nextInt(9000));
            String firstName = "FirstName" + i;
            String lastName = "LastName" + i;
            String email = "employee" + i + "@company.com";
            String phone = "050" + (1000000 + random.nextInt(9000000));
            String address = "Address" + i;
            double salary = 3000 + (15000 - 3000) * random.nextDouble();

            employees[i] = new Employee(id, firstName, lastName, email, phone, address, salary);
        }
        return employees;
    }

    public Employee [] getEmployees(){
        return employees;
    }


    public int getSize(){
        return size;
    }


    public void printAllEmployees(){
        for(int i=0; i<size; i++){
            System.out.println(employees[i]);
        }
    }




}
