

public abstract class User implements HasMenu {
    private String  userName;
    private String PIN;

    public User() {
        this.userName = "";
        this.PIN = "";
    }

    public User(String userName, String PIN) {
        this.userName = userName;
        this.PIN = PIN;
    }

    public boolean login(String userName, String PIN) {
        return this.userName.equals(userName) && this.PIN.equals(PIN);
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setPIN(String PIN){;
        this.PIN = PIN;
    }

    public String getPIN() {
        return PIN;
    }

    public abstract String getReport();



}