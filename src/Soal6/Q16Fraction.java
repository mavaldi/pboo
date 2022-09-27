package Soal6;

public class Q16Fraction
{
    private int numerator;
    private int denominator;

    public Q16Fraction(int numerator, int denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public String getProduct(Q16Fraction fraction)
    {
        int eResult = 0;
        int dResult = 0;
        eResult = this.numerator * fraction.numerator;
        dResult = this.denominator * fraction.denominator;
        return toString(eResult, dResult);
    }

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

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

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
