public class Q13ComputerAccount
{
    // Create class attribute in string for the computer account that contain "realName"
    private String realName;

    // Class attribute for computer account "userName"
    private String userName;

    // Another class attribute for computer account "password"
    private String password;

    // Class constructor for the Q13ComputerAccount class in public type so it can be used in another class
    // The this keyword is used to refer to the current object
    public Q13ComputerAccount(String realName, String userName, String password)
    {
        // Setting realName, userName, and password string the same from the Q13ComputerAccount class
        this.realName = realName;
        this.userName = userName;
        this.password = password;
    }

    // Method implementation of realName (not taking any arguments)
    public void printRealName()
    {
        System.out.println("Name : " + realName);
    }

    // Method implementation of userName (not taking any arguments)
    public void printUserName()
    {
        System.out.println("Username : " + userName);
    }

    // Method implementation of password (not taking any arguments)
    public void printPassword()
    {
        System.out.println("Password : " + password);
    }

    // Method that will be used to change the password string
    // This method take one string arguments named "newPassword"
    // And sets the password with new password with (this.password = newPassword;)
    // The this keyword is used to refer to the current object
    public void changePassword(String newPassword)
    {
        this.password = newPassword;
    }
}
