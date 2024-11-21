import java.util.Random;

public class EmployeeArray {
    private Employee [] employees;
    private int size;

    public EmployeeArray(int capacity){
        employees = new Employee[capacity];
        size=0;
    }

    private void generateRandomEmployee(int count){
        Random rand = new Random();
        for(int i=0; i<count; i++){
            employees[i]=new Employee(i+1,"FirsName" +i,)
        }
    }




}
