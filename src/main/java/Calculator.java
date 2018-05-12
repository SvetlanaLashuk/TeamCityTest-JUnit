import static java.lang.Double.NaN;

public class Calculator {
    public double add(double number1, double number2){
        return round(number1 + number2);
    }

    public double subtract(double number1, double number2){
        return round(number1 - number2);
    }

    public double multiply(double number1, double number2){
        return round(number1 * number2);
    }

    public double divide(double number1, double number2){
        return (number2!=0) ? round(number1 / number2) : NaN;
    }

    public double squareRoot(double number1){
        return (number1>=0) ? round(Math.sqrt(number1)) : NaN;
    }

    private double round(double number){
        number = number*1000;
        int n =(int)Math.round(number);
        number = (double)n/1000;
        return number;
    }
}