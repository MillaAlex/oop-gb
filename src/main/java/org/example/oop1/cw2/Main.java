package org.example.oop1.cw2;

public class Main {
    public static void main(String[] args) {
        CreditAccount creditAccount = new CreditAccount("Ivan Ivanov", 123456, 1000.0, 10.0);
        SaveAccount save = new SaveAccount("Ivan Ivanov", 123456, 3000.0, 5);

        System.out.println(creditAccount.getBalance());
        creditAccount.calculateInterest();
        System.out.println(creditAccount.getBalance());
        save.addInterest();
    }
}

