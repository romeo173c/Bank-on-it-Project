//CheckingAccount.java
import java.util.*;


public class CheckingAccount implements HasMenu{
    protected double balance;

public void CheckingAccounts() {
    this.balance = 0.0;
}

public void CheckingAccounts (double balance){
    this.balance = balance;
}

public double getBalance(){
    return getBalance();
}

public String getBalanceString() {
    return String.format("$%.2f", balance);
}

public void setBalance(double balance) {
    this.balance = balance;
}


public void checkBalance() {
    System.out.println ("Currenet Balance on the Account is:...." + getBalanceString());
}


public void makeDeposit() {
    Scanner scan = new Scanner(System.in);
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
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter the Amount you would like to withdrawal");
    double amount = scan.nextDouble();
    if (amount > 0 && amount <= balance) {
        balance -= amount;
        System.out.println("Your Withdrawal is successful, New Balance is: " + getBalanceString());
    } else {
        System.out.println("The amount you want to Withdrawal is invalid");
    }

}


public String menu() {
    Scanner scan = new Scanner(System.in);
    System.out.println("1) Check Checkings Account");
    System.out.println("2) Check Savings Account");
    System.out.println("3) Deposit");
    System.out.println("4) Withdrawal");
    System.out.println("Please Choose a Option");
    return scan.nextLine();
}

public void start() {
    
    boolean keepGoing = true;
    while (keepGoing)
     {
        
        String choice = menu();

        switch (choice) {
            case "1":
                checkBalance();
                break;
            case "2": 
                makeDeposit();
                break;
            case "3": 
                makeWithdrawal();
                break;
            case "0": 
                System.out.println("Leaving Checking Account.....");
                break;
            default: 
                System.out.println("Please choose a valid option");
        }
         
    }

} 
}






