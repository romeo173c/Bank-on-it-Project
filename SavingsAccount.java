//SavingsAccount.java 

public class SavingsAccount extends CheckingAccount {
    private double interestRate = 0.5d;

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;

    }

    public void calcInterest() {
        double interest = (getBalance * interestRate);
        setBalance(getBalance() + interest);
        System.out.println("Interest has been applied, your new balance is: " + getBalanceString());
    }

public String menu() {
    System.out.println("0) Exit ");
    System.out.println("1) Check Balance ");
    System.out.println("2) Make Deposit ");
    System.out.println("3) Make Withdrawal ");
    System.out.println("Please select one of the options provided ");

}

public void start() {
    Scanner scan = new Scanner(System.In);
   boolean keepGoing = true;

   while (keepGoing) {

   
    int choice = scan.nextInt();
    scanner.nextLine();

    switch (choice) {
        case 1:
            checkBalance();
            break;
        case 2:
            makeDeposit();
            break;
        case 3:
            makeWithdrawal();
            break;
        case 0:
            System.out.println("Leaving Savings Account.....");
            break;
        default: 
            System.out.println("Please choose a vaild option");

            

    }

   }





}

}
