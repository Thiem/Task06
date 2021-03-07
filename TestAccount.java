package Task_06;

public class TestAccount {
    public static void main(String[] args) {
        Account a1 = new Account("N1", "An");
        Account a2 = new Account("N2", "Nam");

        System.out.println(a1.toString());
        a1.credit(1000);
        System.out.println(a1.getBalance());
        System.out.println(a1.debit(1000));
        System.out.println(a1.debit(2000));
        a1.transferTo(a2, 5000);
        a1.transferTo(a2, 2000);
        System.out.println(a2.toString());
    }
}
