package TDD;


// אובייקט של עובד עם פרטים אישיים
public class Employee {
    private String id;
    private String name;
    private String last_name;
    private String mail;
    private String phone;
    private String address;
    private double salary;

    public Employee(String id, String name, String last_name, String mail, String phone, String address, double salary) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
        this.mail = mail;
        this.phone = phone;
        this.address = address;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String toString(){
        return "ID:"+ id + ", "+"Name: "+ name+", "+"Last Name:"+last_name+", "+"Mail:"+mail+", "+"Phone:"+phone+", "+"Address:"+address+", "+"Salary:"+salary;
    }

}
