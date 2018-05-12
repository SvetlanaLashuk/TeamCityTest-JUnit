import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static java.lang.Double.NaN;
import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void testAdditionIntegerPositive() {
        double sum = calculator.add(21,64);
        Assert.assertEquals(85, sum, 0);
    }

    @Test
    public void testAdditionIntPositiveNegative(){
        double sum = calculator.add(4, -82);
        Assert.assertEquals(-78, sum, 0);
    }

    @Test
    public void testAdditionIntegerNegative(){
        double sum = calculator.add(-14, -51);
        Assert.assertEquals(-65, sum, 0);
    }

    @Test
    public void testAdditionZero(){
        double sum = calculator.add(0, 21);
        Assert.assertEquals(21, sum, 0);
    }

    @Test
    public void testAdditionFractionalPositive(){
        double sum = calculator.add(1.56, 5.23);
        Assert.assertEquals(6.79, sum, 0);
    }

    @Test
    public void testAdditionFractPositiveNegative(){
        double sum = calculator.add(-7.35, 2.26);
        Assert.assertEquals(-5.09, sum, 0);
    }

    @Test
    public void testAdditionIntegerFractional(){
        double sum = calculator.add(5.13, 26);
        Assert.assertEquals(31.13, sum,0);
    }

    @Test
    public void testSubtractionIntegerPositive(){
        double diff = calculator.subtract(65, 43);
        Assert.assertEquals(22, diff,0);
    }

    @Test
    public void testSubtractionIntPositiveNegative(){
        double diff = calculator.subtract(53, -21);
        Assert.assertEquals(74, diff,0);
    }

    @Test
    public void testSubtractionIntegerNegative(){
        double diff = calculator.subtract(-78, -21);
        Assert.assertEquals(-57, diff,0);
    }

    @Test
    public void testSubtractionZero(){
        double diff = calculator.subtract(43, 0);
        Assert.assertEquals(43, diff,0);
    }

    @Test
    public void testSubtractionFractionalPositive(){
        double diff = calculator.subtract(9.65, 4.67);
        Assert.assertEquals(4.98, diff,0);
    }

    @Test
    public void testSubtractionFractPositiveNegative(){
        double diff = calculator.subtract(-4.21, 5.3);
        Assert.assertEquals(-9.51, diff,0);
    }

    @Test
    public void testSubtractionFractional(){
        double diff = calculator.subtract(86, 1.4);
        Assert.assertEquals(84.6, diff,0);
    }

    @Test
    public void testMultiplicationIntegerPositive(){
        double mult = calculator.multiply(15, 23);
        Assert.assertEquals(345, mult, 0);
    }

    @Test
    public void testMultiplicationIntegerPositiveNegative(){
        double mult = calculator.multiply(12, -6);
        Assert.assertEquals(-72, mult, 0);
    }

    @Test
    public void testMultiplicationIntegerNegative(){
        double mult = calculator.multiply(-17, -36);
        Assert.assertEquals(612, mult, 0);
    }

    @Test
    public void testMultiplicationZero(){
        double mult = calculator.multiply(20, 0);
        Assert.assertEquals(0, mult, 0);
    }

    @Test
    public void testMultiplicationFractionalPositive(){
        double mult = calculator.multiply(2.2, 4.51);
        Assert.assertEquals(9.922, mult, 0);
    }

    @Test
    public void testMultiplicationFractionalPositiveNegative(){
        double mult = calculator.multiply(-1.2, 1.32);
        Assert.assertEquals(-1.584, mult, 0);
    }

    @Test
    public void testMultiplicationIntegerFractional(){
        double mult = calculator.multiply(5, 4.1);
        Assert.assertEquals(20.5, mult, 0);
    }

    @Test
    public void testMultiplicationOne(){
        double mult = calculator.multiply(6, 1);
        Assert.assertEquals(6, mult, 0);
    }

    @Test
    public void testDivisionIntegerPositive(){
        double div = calculator.divide(12, 4);
        Assert.assertEquals(3, div, 0);
    }

    @Test
    public void testDivisionIntegerPositiveNegative(){
        double div = calculator.divide(28, -10);
        Assert.assertEquals(-2.8, div, 0);
    }

    @Test
    public void testDivisionIntegerNegative(){
        double div = calculator.divide(-56, -4);
        Assert.assertEquals(14, div, 0);
    }

    @Test
    public void testDivisionZero() {
        double div = calculator.divide(9, 0);
        Assert.assertEquals(NaN, div, 0);
    }

    @Test
    public void testDivisionFractionalPositive(){
        double div = calculator.divide(3.28, 5.36);
        Assert.assertEquals(0.612, div, 0);
    }

    @Test
    public void testDivisionFractionalPositiveNegative(){
        double div = calculator.divide(-2.94, 1.2);
        Assert.assertEquals(-2.45, div, 0);
    }

    @Test
    public void testDivisionIntegerFractional(){
        double div = calculator.divide(1.2, 4);
        Assert.assertEquals(0.3, div, 0);
    }

    @Test
    public void testDivisionOme(){
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