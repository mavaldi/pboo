package Soal1;

import java.util.Scanner;

public class Q11
{
    public static void main(String[] args) {
        Q11Fraction q11Fraction = new Q11Fraction();
        boolean loop = true;

        while (loop)
        {
            Scanner userScanner = new Scanner(System.in);
            System.out.print("Please input first fraction (e1/d1): ");
            String firstFraction = userScanner.nextLine();
            String[] splitFirstFraction = firstFraction.split("/");
            int e1 = Integer.parseInt(splitFirstFraction[0]);
            int d1 = Integer.parseInt(splitFirstFraction[1]);

            System.out.print("Please input second fraction (e2/d2): ");
            String secondFraction = userScanner.nextLine();
            String[] splitSecondFraction = secondFraction.split("/");

            int e2 = Integer.parseInt(splitSecondFraction[0]);
            int d2 = Integer.parseInt(splitSecondFraction[1]);

            System.out.print("Please input operation (+, -, *, /): ");
            char operation = userScanner.next().charAt(0);

            userScanner.nextLine();
            q11Fraction.fractionCalculator(e1, d1, e2, d2, operation);

            System.out.print("Do you want to continue (yes/no) : ");
            loop = (userScanner.nextLine().equals("yes"));
            System.out.println();
        }
    }
}
