import java.io.Serializable;



public class Admin extends User implements HasMenu, Serializable {

    public Admin(){
        String userName = "Admin";
        String PIN = "2002";
    }


public String menu() {
    return          "0) Exit This Menu: " + 
                    "1) Full Customer Report: " + 
                    "2) Add User: " +
                    "3) Apply Interest to Savings Account: ";
}




public String getReport() {
    return "Admin: " + getUserName() + " PIN: " + getPIN();
}





public void start(){

}
}



