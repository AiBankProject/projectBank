package Bank;

public class Main {
    public static void main(String[] args) {
        Account a1 = new Account(1, "Nurlan", "Taubai", 700000);
        Account a2 = new Account(2, "Ramisa", "Shalabayeva", 1300000);
        Account a3 = new Account(3, "Nail", "Ablizov", 340000);

        BankApplication bank = new BankApplication("Kaspi");
        bank.addAccount(a1);
        bank.addAccount(a2);
        bank.addAccount(a3);

        System.out.println(bank.getBankData());
    }
}

