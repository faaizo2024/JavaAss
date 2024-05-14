package Assignment1;

public class person {

    protected String name, address, phone, email;

    public person(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Class: Person, Name: " + name+ " address: "+address + " phone: "+phone + " email: "+email ;
    }
}
