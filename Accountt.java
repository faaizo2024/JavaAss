public class Accountt {
//    private Integer account_number;
//    private Integer balance;
//    private String fullname;
//
////    public Integer get () {
////        return age;
////    }
////
////    public Long getPhone() {
////        return phone;
////    }
////
////
////    public String getName() {
////        return name;
////    }
////    public void setAge(Integer age) {
////        this.age = age;
////    }
////
////    public void setName(String name) {
////        this.name = name;
////    }
////
////    public void setPhone(Long phone) {
////        this.phone = phone;
////    }
////
////    public Preson(){
////
////    }
////    public Preson(String name,Integer age, Long phone){
////        this.name=name;
////        this.age=age;
////        this.phone=phone;
////    }
//
//    public Integer getAccount_number() {
//        return account_number;
//    }
//
//    public Integer getBalance() {
//        return balance;
//    }
//
//    public String getFullname() {
//        return fullname;
//    }
//
//    public void setAccount_number(Integer account_number) {
//        this.account_number = account_number;
//    }
//
//    public void setBalance(Integer balance) {
//        this.balance = balance;
//    }
//
//    public void setFullname(String fullname) {
//        this.fullname = fullname;
//    }



    protected double balance;

    public Accountt() {
        balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount < 1) {
            throw new IllegalArgumentException("Invalid deposit amount");
        }
        balance += amount;
        System.out.println("Deposit successful. Current balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount < 1) {
            throw new IllegalArgumentException("Invalid withdrawal amount");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Current balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}

