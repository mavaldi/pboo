public class Q12Time
{
    public static int calculateAngle (int h, int m)
    {
        // Making limits of hours and minutes input between 0 - 24 for hours input and 0 - 60 for minutes input
        // And if the inputs didn't between those numbers, it will print "Wrong input".
        if(h < 0 || h > 24 || m < 0 || m > 60)
        {
            System.out.println("Wrong input");
        }
        // If the hours is 12 or 24 (line 23 - 26) the hours should be 0 because it doesn't have any angle
        if(h == 12)
        {
            h = 0;
        }
        // If the minutes input is 60, which means 1 hours
        // The hours should be added by 1 and the minutes become 0
        if(m == 60)
        {
            m = 0;
            h += 1;
        }
        // If the hours is over 12, it should be changed to the number that was actually in the clock, which is 0 - 12. by subtracting the hours with 12
        if(h > 12)
        {
            h = h-12;
        }
        // Define the angle of hour hand by (hours x 60 + minutes) x 0.5
        int angle_h = (int) (0.5 * (h * 60 + m));
        int angle_m;
        // Because we measuring the angle counterclockwise from the hour hand to minute hand, we will having 2 condition
        // The first is : if the minute over the hour times 5, the angle of minute hand should be 360 - (6 x minutes)
        if(m > (h * 5))
        {
            angle_m = 360 - (6 * m);
        }
        // The second is : if the minutes is under or the same with the hour times 5, the angle of minute hand should be 6 x minutes
        else
        {
            angle_m = 6 * m;
        }
        // The result of the angle is angle of hour hand + angle of minute hand
        return angle_h + angle_m;
    }

    public static void main (String[] args)
    {
        System.out.println(calculateAngle(9, 00));
        System.out.println(calculateAngle(3, 00));
        System.out.println(calculateAngle(18, 00));
        System.out.println(calculateAngle(1, 00));
        System.out.println(calculateAngle(2, 30));
        System.out.println(calculateAngle(4, 41));
    }
}
