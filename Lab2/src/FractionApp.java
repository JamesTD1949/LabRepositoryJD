public class FractionApp {
    public static void main(String[] args) {
        Fraction f1 = new Fraction();

        System.out.println(f1.toString());

        f1.setNumerator(15);
        f1.setDenominator(25);

        System.out.println(f1.toString());

        Fraction f2 = new Fraction();

        f2.setNumerator(10);
        f2.setDenominator(20);

        System.out.println(Fraction.addition(f1,f2));

        System.out.println(Fraction.subtraction(f1,f2));

        System.out.println(Fraction.multiplication(f1,f2));

        System.out.println(Fraction.division(f1,f2));
    }


}
