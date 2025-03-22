//CheckingAccount.java

import java.util.Scanner;
 
public interface hasMenu{
    String Menu();

    void start();
}

public class CheckingAccount implements HasMenu{
    private double balance;

public CheckingAccount() {
    this.balance = 0.0;
}

public CheckingAccount(double balance){
    this.balance = balance;
}

public String getBalance() {
    return String.format("$%.2f", balance);
}

public void setBalance(double balance) {
    this.balance = balance;
}


public void checkBalance() {
    System.out.println ("Currenet Balance on the Account is:...." + getBalanceString());
}

public String hasMenu(){

}

public void makeDeposit() {
    Scanner scan = new Scanner(System.In);
    System.out.println("Please Deposit Ammount: ");
    double amount = scan.nextDouble();
    if (amount > 0) {
        balance += amount;
        System.out.println("Your Desposit went through, New Balance is: " + getBalanceString());
    } else {
        System.out.println("Ammount you enetred is invalid.");

    }
    }

public void makeWithdrawal() {
    Scanner scan = new Scanner(System.In);
    System.out.println("Please enter the Amount you would like to withdrawal");
    double ammount =scan.nextDouble();
    if (amount > 0 && amount <= balance) {
        balance -= amount;
        System.out.println("Your Withdrawal is successful, New Balance is: " + getBalanceString());
    } else {
        System.out.println("The amount you want to Withdrawal is invalid");
    }

}


public String menu() {
    Scanner scan = new Scanner(System.in);
    return scan;
    System.out.println("1) Check Checkings Account");
    System.out.println("2) Check Savings Account");
    System.out.println("3) Deposit");
    System.out.println("4) Withdrawal");
    System.out.println("Please Choose a Option");
    

}

public void start() {
    Scanner scan = new Scanner(System.in);
    int choice;
    boolean keepGoing = true;
    while (keepGoing)
     {
        System.out.println(menu());
        choice = scan.nextInt();
        scan.nextLine();

        switch (choice) {
            case 1:
                checkBalance();
                break;
            case 2: 
                makeDeposit(scan);
                break;
            case 3: 
                makeWithdrawal(scan);
                break;
            case 0: 
                System.out.println("Leaving Checking Account.....");
                break;
            default: 
                 System.out.println("Please choose a valid option");
        }
         
    }

} 
}






