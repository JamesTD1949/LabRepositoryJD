public class BankTest {
    public static void main(String[] args) {
        SavingsAccount test = new SavingsAccount("James Gosling",571357198,100.00);

        System.out.println(test.toString());

        test.lodge(300);
        System.out.println(test.getBalance());

        test.withdraw(50);
        System.out.println(test.getBalance());

        System.out.println(test.calcTax());
    }
}
