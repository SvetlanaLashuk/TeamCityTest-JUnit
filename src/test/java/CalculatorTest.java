import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static java.lang.Double.NaN;


public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void testAddIntegerPositive() {
        double sum = calculator.add(21,64);
        Assert.assertEquals(85, sum, 0);
    }

    @Test
    public void testAddIntPositiveNegative(){
        double sum = calculator.add(4, -82);
        Assert.assertEquals(-78, sum, 0);
    }

    @Test
    public void testAddIntegerNegative(){
        double sum = calculator.add(-14, -51);
        Assert.assertEquals(-65, sum, 0);
    }

    @Test
    public void testAddZero(){
        double sum = calculator.add(0, 21);
        Assert.assertEquals(21, sum, 0);
    }

    @Test
    public void testAddFractionalPositive(){
        double sum = calculator.add(1.56, 5.23);
        Assert.assertEquals(6.79, sum, 0);
    }

    @Test
    public void testAddFractPositiveNegative(){
        double sum = calculator.add(-7.35, 2.26);
        Assert.assertEquals(-5.09, sum, 0);
    }

    @Test
    public void testAddIntegerFractional(){
        double sum = calculator.add(5.13, 26);
        Assert.assertEquals(31.13, sum,0);
    }

    @Test
    public void testSubtractIntegerPositive(){
        double diff = calculator.subtract(65, 43);
        Assert.assertEquals(22, diff,0);
    }

    @Test
    public void testSubtractIntPositiveNegative(){
        double diff = calculator.subtract(53, -21);
        Assert.assertEquals(74, diff,0);
    }

    @Test
    public void testSubtractIntegerNegative(){
        double diff = calculator.subtract(-78, -21);
        Assert.assertEquals(-57, diff,0);
    }

    @Test
    public void testSubtractZero(){
        double diff = calculator.subtract(43, 0);
        Assert.assertEquals(43, diff,0);
    }

    @Test
    public void testSubtractFractionalPositive(){
        double diff = calculator.subtract(9.65, 4.67);
        Assert.assertEquals(4.98, diff,0);
    }

    @Test
    public void testSubtractFractPositiveNegative(){
        double diff = calculator.subtract(-4.21, 5.3);
        Assert.assertEquals(-9.51, diff,0);
    }

    @Test
    public void testSubtractFractional(){
        double diff = calculator.subtract(86, 1.4);
        Assert.assertEquals(84.6, diff,0);
    }

    @Test
    public void testMultiplyIntegerPositive(){
        double mult = calculator.multiply(15, 23);
        Assert.assertEquals(345, mult, 0);
    }

    @Test
    public void testMultiplyIntegerPositiveNegative(){
        double mult = calculator.multiply(12, -6);
        Assert.assertEquals(-72, mult, 0);
    }

    @Test
    public void testMultiplyIntegerNegative(){
        double mult = calculator.multiply(-17, -36);
        Assert.assertEquals(612, mult, 0);
    }

    @Test
    public void testMultiplyZero(){
        double mult = calculator.multiply(20, 0);
        Assert.assertEquals(0, mult, 0);
    }

    @Test
    public void testMultiplyFractionalPositive(){
        double mult = calculator.multiply(2.2, 4.51);
        Assert.assertEquals(9.922, mult, 0);
    }

    @Test
    public void testMultiplyFractionalPositiveNegative(){
        double mult = calculator.multiply(-1.2, 1.32);
        Assert.assertEquals(-1.584, mult, 0);
    }

    @Test
    public void testMultiplyIntegerFractional(){
        double mult = calculator.multiply(5, 4.1);
        Assert.assertEquals(20.5, mult, 0);
    }

    @Test
    public void testMultiplyOne(){
        double mult = calculator.multiply(6, 1);
        Assert.assertEquals(6, mult, 0);
    }

    @Test
    public void testDivideIntegerPositive(){
        double div = calculator.divide(12, 4);
        Assert.assertEquals(3, div, 0);
    }

    @Test
    public void testDivideIntegerPositiveNegative(){
        double div = calculator.divide(28, -10);
        Assert.assertEquals(-2.8, div, 0);
    }

    @Test
    public void testDivideIntegerNegative(){
        double div = calculator.divide(-56, -4);
        Assert.assertEquals(14, div, 0);
    }

    @Test
    public void testDivideZero() {
        double div = calculator.divide(9, 0);
        Assert.assertEquals(NaN, div, 0);
    }

    @Test
    public void testDivideFractionalPositive(){
        double div = calculator.divide(3.28, 5.36);
        Assert.assertEquals(0.612, div, 0);
    }

    @Test
    public void testDivideFractionalPositiveNegative(){
        double div = calculator.divide(-2.94, 1.2);
        Assert.assertEquals(-2.45, div, 0);
    }

    @Test
    public void testDivideIntegerFractional(){
        double div = calculator.divide(1.2, 4);
        Assert.assertEquals(0.3, div, 0);
    }

    @Test
    public void testDivideOne(){
        double div = calculator.divide(6, 1);
        Assert.assertEquals(6, div, 0);
    }

    @Test
    public void testSquareRootInteger(){
        double sqrt = calculator.squareRoot(16);
        Assert.assertEquals(4, sqrt, 0);
    }

    @Test
    public void testSquareRootFractional(){
        double sqrt = calculator.squareRoot(2.56);
        Assert.assertEquals(1.6, sqrt, 0);
    }

   @Test
    public void testSquareRootNegative(){
        double sqrt = calculator.squareRoot(-2.89);
        Assert.assertEquals(NaN, sqrt, 0);
    }
}