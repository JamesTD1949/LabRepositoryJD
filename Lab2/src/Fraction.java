public class Fraction {

    private int numerator,denominator;

    public Fraction(){
        Fraction(0,1);
    }

    public void Fraction(int numerator, int denominator)
    {
        setNumerator(numerator);
        setDenominator(denominator);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public String toString() {

        if(numerator == 0 && denominator==1)
            return("testing the no argument constructor...." + getNumerator() + "/" + getDenominator());
        else
            return("testing the 2 argument constructor...." + getNumerator() + "/" + getDenominator());

    }

    public static String addition(Fraction f1, Fraction f2)
    {
        return("Value of " + f1.numerator + "/" + f1.denominator + " + " + f2.numerator + "/" + f2.denominator + " is " +
            (f1.numerator*f2.denominator + f2.numerator*f1.denominator) + "/" + (f1.denominator*f2.denominator));



    }

    public static String subtraction(Fraction f1, Fraction f2)
    {
        return("Value of " + f1.numerator + "/" + f1.denominator + " + " + f2.numerator + "/" + f2.denominator + " is " +
                (f1.numerator*f2.denominator - f2.numerator*f1.denominator) + "/" + (f1.denominator*f2.denominator));
    }

    public static String multiplication(Fraction f1, Fraction f2)
    {
        return("Value of " + f1.numerator + "/" + f1.denominator + " + " + f2.numerator + "/" + f2.denominator + " is " +
                (f1.numerator*f2.numerator) + "/" + (f1.denominator*f2.denominator));
    }

    public static String division(Fraction f1, Fraction f2)
    {
        return("Value of " + f1.numerator + "/" + f1.denominator + " + " + f2.numerator + "/" + f2.denominator + " is " +
                (f1.numerator*f2.denominator) + "/" + (f1.denominator*f2.numerator));
    }
}
