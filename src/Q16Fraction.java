public class Q16Fraction
{
    // Class attribute for the numerator and denominator of the fraction in integer
    private int numerator;
    private int denominator;

    // Class constructor for the Q16fraction class in public type so it can be used in another class
    // The this keyword is used to refer to the current object
    public Q16Fraction(int numerator, int denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // Getter method to to get the product of fraction
    // The this keyword is used to refer to the current object
    public String getProduct(Q16Fraction fraction)
    {
        int eResult = 0;
        int dResult = 0;
        eResult = this.numerator * fraction.numerator;
        dResult = this.denominator * fraction.denominator;
        return toString(eResult, dResult);
    }

    // Getter method to to get the sum of fraction
    // The this keyword is used to refer to the current object
    public String getSum(Q16Fraction fraction)
    {
        int eResult = 0;
        int dResult = 0;
        if(this.denominator == fraction.getDenominator())
        {
            eResult = this.numerator + fraction.numerator;
            dResult = this.denominator;
        }
        else
        {
            eResult = this.numerator * fraction.denominator + fraction.numerator * this.denominator;
            dResult = this.denominator * fraction.denominator;
        }
        return toString(eResult, dResult);
    }

    // Getter method to return the value of variable numerator
    public int getNumerator()
    {
        return numerator;
    }

    // Setter method that takes parameter numerator and assigns it to the numerator variable
    // The this keyword is used to refer to the current object
    public void setNumerator(int numerator)
    {
        this.numerator = numerator;
    }

    // Getter method to return the value of variable denominator
    public int getDenominator()
    {
        return denominator;
    }

    // Setter method that takes parameter denominator and assigns it to the denominator variable
    // The this keyword is used to refer to the current object
    public void setDenominator(int denominator)
    {
        this.denominator = denominator;
    }

    // toString method that returns a string in the given format
    @Override
    public String toString()
    {
        return String.format("%d/%d", this.numerator, this.denominator);
    }

    public String toString(int numerator, int denominator)
    {
        return String.format("%d/%d", numerator, denominator);
    }
}
