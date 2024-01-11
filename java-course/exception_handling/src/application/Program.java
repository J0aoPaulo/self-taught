package application;

import entities.Account;
import model.exception.DomainException;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int accountNumber = sc.nextInt();
            System.out.print("Enter account holder name: ");
            String accountHolder = sc.nextLine();
            sc.nextLine();
            System.out.print("Enter a inital balance: ");
            Double initBalance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            Double withdrawLimit = sc.nextDouble();
            Account account = new Account(accountNumber, accountHolder, initBalance, withdrawLimit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            double withdrawAmount = sc.nextDouble();
            System.out.print("New balance: " + account.withdrawOperation(withdrawAmount));
        } catch (DomainException e) {
            System.err.print(e.getMessage());
        } catch (RuntimeException e) {
            System.err.print("Unexpected error");
        }
    }
}