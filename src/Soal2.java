import java.util.Scanner;

public class Soal2
{
    static String time;
    static int hour;
    static int minute;

    public static void calculateDegree()
    {
        float degree = 0;
        float degreeHour = 0;
        float degreeMinute = 0;
        if(hour == 12)
            hour = 0;
        if(hour > 11)
            hour -= 12;

        degree = Math.abs(degreeHour - degreeMinute);
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
