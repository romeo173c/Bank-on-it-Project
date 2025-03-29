import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;


public class Bank implements HasMenu {
    private Admin admin;
    private ArrayList<Customer> customers;

    public Bank () {
        this.admin = new Admin();
        this.customers = new ArrayList<Customer>();
    }
    public void loadSampleCustomers(){
        customers.add(new Customer("Romeo Casiano", "6312"));
        customers.add(new Customer("John Cena", "1982"));
        System.out.println("Sample Customers");
    }
    public void addUser(String userName, String PIN) {
        customers.add(new Customer(userName,PIN));
        System.out.println("A New Customer Has Been Added: " + userName);
    }
    public void applyInterest(){
        for (Customer customer : customers) {
            customer.getBalance().calculateInterest();
        }
        System.out.println("The interest has been applied to the account ");
    }
    


public void loginAsCustomer() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please Enter your username: ");
    String userName = scanner.nextLine();
    System.out.println("Please enter your PIN: ");
    String PIN = scanner.nextLine();

    for(Customer customer : customers) {
        if (customer.login(userName, PIN)) {
            System.out.println("Your login is successful");
            customer.menu();
            return;
        }
    }
    System.out.println("The credentials entered is not vaild, please try again");
}

public void startAdmin() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Admin username needed:");
    String userName = scanner.nextLine();
    String PIN = scanner.nextLine();
    
    if (admin.login(userName, PIN)) {
        System.out.println("Login successful");
        admin.menu();
    } else {
        System.out.println("The credentials entered is not vaild, please try again ");

    }
}
public String menu() {
    Scanner scanner = new Scanner(System.in);
    boolean keepGoing = true;

    while (keepGoing) {
        System.out.println("1) Customer Login");
        System.out.println("2) Admin Login");
        System.out.println("3) Exit");
        System.out.println("Please choose one of the options listed above");

        String choice = scanner.nextLine();

        switch(choice){
            case "1":
                loginAsCustomer();
                break;
            case "2":
                startAdmin();
                break;
            case "3":
                System.out.println("Have a great day!");
                keepGoing = false;
                break;
            default:
                System.out.println("Please select one of the options listed");
        }
    }
    return "Leaving Menu.....";
}

public void start() {

    boolean keepGoing = true;
    while (keepGoing)
     {
        
        String choice = menu();

        switch (choice) {
            case "1":
                startAdmin();
                break;
            case "2": 
                loginAsCustomer();
                break;
            case "0": 
                System.out.println("Exit System.....");
                break;
            default: 
                System.out.println("Please choose a valid option");
        }
         
    }
    
}
}

