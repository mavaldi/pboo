package Soal2;

import java.util.Scanner;

public class Q12Time
{
    static String time;
    static int hour;
    static int minute;

    public static void calculateDegree()
    {
        int degreeHour = (hour * 360) / 12 + (minute * 360) / (12 * 60);
        int degreeMinute = (minute * 360) / (60);
        int degree = Math.abs(degreeHour - degreeMinute);

        if (degree < 0)
            degree = degree + 360;

        if (degree > 360)
            degree = degree - 360;

        System.out.println("Result of " + time + " : " + degree + "°");
    }

    public static void main(String[] args) {
        boolean loop = true;
        while (loop)
        {
            Scanner userScanner = new Scanner(System.in);
            System.out.print("Please input time (HH:MM): ");
            time = userScanner.nextLine();
            String[] timeFraction = time.split(":");
            hour = Integer.parseInt(timeFraction[0]);
            minute = Integer.parseInt(timeFraction[1]);

            calculateDegree();

            System.out.print("Do you want to continue (yes/no) : ");
            loop = (userScanner.nextLine().equals("yes"));
        }
    }
}
