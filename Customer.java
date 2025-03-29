import java.util.*;

public class Customer extends User{
    private CheckingAccount checking;
    private SavingsAccount savings;


public Customer(String userName, String PIN){
    super(userName, PIN);
    this.checking = new CheckingAccount();
    this.savings = new SavingsAccount();

}


public String getReport() {
    return "User: " + getUserName() + 
            "Checking Balance: " + checking.getBalance() +
            "Savings Balance: " + savings.getBalance();

}
 
 public String menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1) Checkings Balance");
        System.out.println("2) Savings Balance");
        System.out.println("3) Exit");
        return scan.nextLine();
        
 }


 public void start() {
    
    boolean keepGoing = true;
    while (keepGoing)
     {
        
        String choice = menu();

        switch (choice) {
            case "1":
                System.out.println("Checkings: " + checking.getBalance());
                break;
            case "2": 
                System.out.println("Savings: " + savings.getBalance());
                break;
            case "3": 
                System.out.println();
                break;
            default: 
                System.out.println("Please choose a valid option");
        }
         
    }

 }

}