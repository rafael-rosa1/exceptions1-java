package exercicio1.application;

import exercicio1.model.entities.Account;
import exercicio1.model.exceptions.WithdrawException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Holder: ");
        String name = sc.nextLine();
        System.out.print("Initial balance: ");
        double balance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double limit = sc.nextDouble();
        System.out.println();

        Account acc = new Account(number, name, balance, limit);

        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        try {
            acc.withdraw(amount);
            System.out.println(acc);
        }
        catch (WithdrawException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
