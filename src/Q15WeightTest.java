public class Q15WeightTest
{
    public static void main(String[] args)
    {
        // Create an object of class Q15Weight (This will call the constructor)
        // You can input the weight in pounds here
        Q15Weight weightConvert = new Q15Weight(2);

        // Print out both weight in pounds and kilograms from the methods getPounds and getKilograms
        System.out.println("Weight in pounds : " + weightConvert.getPounds());
        System.out.println("Weight in kilograms : " + weightConvert.getKilograms());
    }
}
