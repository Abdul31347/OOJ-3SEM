import java.util.Scanner;

class Account {
    String name;
    int accNo;
    double balance;

    public Account(String name, int accNo, double balance) {
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful! Current balance = " + balance);
    }

    public void display() {
        System.out.println("Current balance = " + balance);
    }
}

class SavAccount extends Account {
    public SavAccount(String name, int accNo, double balance) {
        super(name, accNo, balance);
    }

    public void calculateInterest() {
        double rate = 0.05;
        double interest = rate * balance;
        balance += interest;
        System.out.println("Interest applied! Current balance = " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful! Current balance = " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

class CurAccount extends Account {
    int minBalance = 1000;
    int penalty = 50;

    public CurAccount(String name, int accNo, double balance) {
        super(name, accNo, balance);
    }

    public void withdraw(double amount) {
        if (balance - amount >= minBalance) {
            balance -= amount;
            System.out.println("Withdrawal successful! Current balance = " + balance);
        } else {
            balance -= penalty;
            System.out.println("Penalty applied! Current balance = " + balance);
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SavAccount sav = new SavAccount("Abe", 203, 1000);
        CurAccount cur = new CurAccount("Abc", 204, 2000);

        int choice;
        while (true) {
            System.out.println("Press 1 for Savings Account, 2 for Current Account, 0 to Exit:");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("1 - Display Balance\n2 - Withdraw\n3 - Deposit\n4 - Calculate Interest");
                int option = sc.nextInt();
                if (option == 1) {
                    sav.display();
                } else if (option == 2) {
                    System.out.print("Enter amount to withdraw: ");
                    double amount = sc.nextDouble();
                    sav.withdraw(amount);
                } else if (option == 3) {
                    System.out.print("Enter amount to deposit: ");
                    double amount = sc.nextDouble();
                    sav.deposit(amount);
                } else if (option == 4) {
                    sav.calculateInterest();
                } else {
                    System.out.println("Invalid option.");
                }
            } else if (choice == 2) {
                System.out.println("1 - Display Balance\n2 - Withdraw\n3 - Deposit");
                int option = sc.nextInt();
                if (option == 1) {
                    cur.display();
                } else if (option == 2) {
                    System.out.print("Enter amount to withdraw: ");
                    double amount = sc.nextDouble();
                    cur.withdraw(amount);
                } else if (option == 3) {
                    System.out.print("Enter amount to deposit: ");
                    double amount = sc.nextDouble();
                    cur.deposit(amount);
                } else {
                    System.out.println("Invalid option.");
                }
            } else if (choice == 0) {
                System.out.println("Exiting program.");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }
}
