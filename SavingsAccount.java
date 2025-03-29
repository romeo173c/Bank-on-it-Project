//SavingsAccount.java 
import java.util.*;

public class SavingsAccount extends CheckingAccount {
    private double interestRate = 0.5d;
    

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;

    }
    
    public double getBalance() {
        return balance;
    }


    public void calcInterest() {
        double interest = (getBalance() * interestRate);
        setBalance(getBalance() + interest);
        System.out.println("Interest has been applied, your new balance is: " + getBalanceString());
    }
}