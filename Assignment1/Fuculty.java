package Assignment1;

import  java.util.Date;
public class Fuculty extends Employee {


    protected String officeHours, rank;

    public Fuculty(String name, String address, String phone, String email, String office, double salary, Dtae dateHired, String officeHours, String rank) {
        super(name, address, phone, email, office, salary,dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Class: Faculty, Name: " + name;
    }
}
