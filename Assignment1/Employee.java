package Assignment1;

public class Employee extends  person {

    protected String office;
    protected double salary;
    protected Dtae dateHired;

    public Employee(String name, String address, String phone, String email, String office, double salary, Dtae dateHired) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Class: Employee, Name: " + name;
    }

}
