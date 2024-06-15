package DSA_2nd_Sem.Assignment3;

import java.util.Scanner;

class InvalidBalanceException extends Exception {
    InvalidBalanceException(String s) {
        super(s);
    }
}

class Bank {
    int accNo;
    String name;
    double balance;
    Bank(String n, int a, double b) throws InvalidBalanceException {
        if (b <= 0)
            throw new InvalidBalanceException("Balance can't be less than 0");
        name = n;
        accNo = a;
        balance = b;
    }
    void withdraw(double amt) throws InvalidBalanceException {
        if (amt > balance)
            throw new InvalidBalanceException("Balance can't be less than 0");
        balance -= amt;
    }
    String getN() {
        return name;
    }
    int getAc() {
        return accNo;
    }
    double getB() {
        return balance;
    }
}

class HQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String n = sc.next();
        System.out.print("Enter a/c number: ");
        int a = sc.nextInt();
        System.out.print("Enter balance: ");
        double b = sc.nextDouble();
        try {
            Bank bank = new Bank(n, a, b);
            System.out.println("Details of the Account Holder:");
            System.out.println("Name: " + bank.getN());
            System.out.println("Account number: " + bank.getAc());
            System.out.println("Balance: " + bank.getB());
            System.out.println("Enter the money to withdraw:");
            double amount = sc.nextDouble();
            bank.withdraw(amount);
            System.out.println("After withdraw, Balance = " + bank.getB());
        } catch (Exception e) {
            System.out.println(e);
        }
        sc.close();
    }
}
