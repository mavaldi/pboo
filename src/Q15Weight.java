public class Q15Weight
{
    // Class attribute in double for weight in pounds
    private double weight_p;

    // Class constructor for the Q15Weight class in public type so it can be used in another class
    // The this keyword is used to refer to the current object
    public Q15Weight(double p)
    {
        this.weight_p = p;
    }

    // Getter method to return the value of variable weight_p (return the weight in pounds)
    public double getPounds()
    {
        return weight_p;
    }

    // Getter method to return the weight in kilograms by multiplying variable weight_p with 0.45359237
    public double getKilograms()
    {
        return weight_p *  0.45359237;
    }
}
