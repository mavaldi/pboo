public class Q13ComputerAccountTest
{
    public static void main(String[] args)
    {
        // Create an object of class Q13ComputerAccount (This will call the constructor)
        Q13ComputerAccount computerAccount = new Q13ComputerAccount("Mavaldi Rizqy", "RizqyM", "123456789");

        // Print out the computer account before we change the password
        System.out.println("Current account :");
        computerAccount.printRealName();
        computerAccount.printUserName();
        computerAccount.printPassword();

        // Change the computer account password by using the changePassword method
        computerAccount.changePassword("qwertyuiop");

        // Print out the computer account after we change the password to "qwertyuiop"
        System.out.println("\nAccount after new password :");
        computerAccount.printRealName();
        computerAccount.printUserName();
        computerAccount.printPassword();

    }
}
