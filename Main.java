
public class Main {

    public static void main(String[] args) {
       Accountt account = new Saving_account();
        try {
            account.deposit(555);
            account.withdraw(55);
            account.withdraw(150); // This should throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        class SavingAccount extends
                Saving_account{
            //constructor


        }

    }

}

//
//    public static void main(String[] args) {
//        GeometricObject[] geometricObjects = new GeometricObject[5];
//        geometricObjects[0] = new Square(5);
//        geometricObjects[1] = new Square(7);
//        geometricObjects[2] = new Square(3);
//        geometricObjects[3] = new Square(6);
//        geometricObjects[4] = new Square(4);
//
//        for (GeometricObject geometricObject : geometricObjects) {
//            System.out.println("Area: " + geometricObject.getArea());
//            if (geometricObject instanceof Colorable) {
//                ((Colorable) geometricObject).howToColor();
//            }
//        }
//    }

