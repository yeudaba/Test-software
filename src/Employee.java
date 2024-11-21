public class Employee {
    private int id;
    private String name;
    private String last_name;
    private String mail;
    private String phone;
    private String address;
    private double salary;

    public Employee(int id, String name, String last_name, String mail, String phone, String address, double salary) {
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
        return String.format("Employee[id=%d, name=%s, %s, salary=%.2f]", id, name, last_name, salary);
    }

}
