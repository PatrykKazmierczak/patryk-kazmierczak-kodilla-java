package chellenges;

public class User {
    private String userName;
    private String userSurname;
    private String userAdress;
    private String userMailAdress;
    private int userAge;
    private int userPhoneNumber;

    public User(String userName, String userSurname, String userAdress, String userMailAdress, int userAge, int userPhoneNumber) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.userAdress = userAdress;
        this.userMailAdress = userMailAdress;
        this.userAge = userAge;
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public String getUserAdress() {
        return userAdress;
    }

    public String getUserMailAdress() {
        return userMailAdress;
    }

    public int getUserAge() {
        return userAge;
    }

    public int getUserPhoneNumber() {
        return userPhoneNumber;
    }
}
