package Soal3;

public class Q13ComputerAccountTest
{
    public static void main(String[] args) {
        Q13ComputerAccount q13ComputerAccount = new Q13ComputerAccount("Rizky Mavaldi", "RizkyM", "123456789");
        System.out.println("Akun Awal");
        q13ComputerAccount.printRealName();
        q13ComputerAccount.printUserName();
        q13ComputerAccount.printPassword();

        q13ComputerAccount.changePassword("QWERTYUIOP");

        System.out.println("\nAkun setelah diganti password");
        q13ComputerAccount.printRealName();
        q13ComputerAccount.printUserName();
        q13ComputerAccount.printPassword();
    }
}
