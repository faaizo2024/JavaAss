public class Saving_account extends  Accountt {

    @Override
    public void withdraw(double amount) {
        if (balance - amount < 100) {
            throw new IllegalArgumentException("Minimum balance requirement not met");
        }
        super.withdraw(amount);
    }
}
 