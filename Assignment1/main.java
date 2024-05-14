package Assignment1;

public class main {

        public static void main(String[] args) {
            person person = new person("Faaisa said", "123 Waddada Koowaad", "612345", "fizka@gmail.com");
            Student student = new Student("Hdan Mohamed", "124 Waddada Labaad", "555-555-5556", "hodan@example.com", Student.FRESHMAN);
            Dtae dateHired = new Dtae("2024-01-01"); // Assuming this is correctly implemented
            Employee employee = new Employee("Osman Ali", "125 Waddada Saddexaad", "555-555-5557", "osman@example.com", "Xafiiska 2aad", 1000, dateHired);
            Fuculty faculty = new Fuculty("Fatima Ibrahim", "9-5", "555-555-555", "Fatima@gmai.com","Xafiiska 4aad", 1355, dateHired, "100","1");
            Staff staff = new Staff("Aisha Nur", "Secretary", "555-555-555", "Aisha@gmail.com","Xafiisla 3aad", 1567, dateHired, "Manager");

            System.out.println(person);
            System.out.println(student);
            System.out.println(employee);
            System.out.println(faculty);
            System.out.println(staff);

        }
    }

