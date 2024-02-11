package calculator;


import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

    private static Calculator calculator;

    @BeforeClass
    public static void init() {
        calculator = new Calculator();
    }

    @Test
    public void powerTwoNumbersTest() {
        Assert.assertEquals(64.0, calculator.powerTwoNumbers(4.0,3.0),0.0);
    }

    @Test
    public void sqrtTest() {
        Assert.assertEquals(8.0, calculator.sqrt(64.0),0.0);
    }

    @Test
    public void CalculateSquareAreaTest() {
        Assert.assertEquals(4.0, calculator.CalculateSquareArea(2),0.0);
    }

    @Test
    public void CalculateRectAreaTest() {
        Assert.assertEquals(8.0, calculator.CalculateRectArea(2,4),0.0);
    }

    @Test
    public void CalculateSquareCircTest() {
        Assert.assertEquals(12, calculator.CalculateSquareCirc(3));
    }

    @Test
    public void CalculateRectCircTest() {
        Assert.assertEquals(8, calculator.CalculateRectCirc(2,2));
    }

    @Test
    public void CalculateTriangleAreaTest() {
        Assert.assertEquals(6.0, calculator.CalculateTriangleArea(4,3),0.0);
    }

    @Test
    public void CalculateTriangleCircTest() {
        Assert.assertEquals(12.0, calculator.CalculateTriangleCirc(3,4,5),0.0);
    }

    @Test
    public void convertCelsiusToFarenheitTest() {
        Assert.assertEquals(68.0, calculator.convertCelsiusToFarenheit(20),0.0);
    }

    @Test
    public void convertFarenheitToCelsiusTest() {
        Assert.assertEquals(16.0, calculator.convertFarenheitToCelsius(60),0.0);
    }

    @Test
    public void convertFromMphToKphTest() {
        Assert.assertEquals(161.0, calculator.convertFromMphToKph(100),0.0);
    }

    @Test
    public void factorialTest() {
        Assert.assertEquals(1, calculator.factorial(-4));
        Assert.assertEquals(1, calculator.factorial(-1));
        Assert.assertEquals(1, calculator.factorial(0));
        Assert.assertEquals(1, calculator.factorial(1));
        Assert.assertEquals(2, calculator.factorial(2));
        Assert.assertEquals(24, calculator.factorial(4));
    }

    @Test
    public void fibbonacciTest() {
        Assert.assertEquals(21, calculator.fibbonacci(8));
    }

    @Test
    public void findGCDTest() {
        Assert.assertEquals(1, calculator.findGCD(8,3));
    }

    @Test
    public void findLCMTest() {
        Assert.assertEquals(24, calculator.findLCM(8,12));
    }

    @Test
    public void isPrimeTrueTest() {
        boolean prime = calculator.isPrime(7);
        Assert.assertTrue(prime);
    }

    @Test
    public void isPrimeFalseTest() {
        Assert.assertFalse(calculator.isPrime(1));
        Assert.assertFalse(calculator.isPrime(8));

        Assert.assertTrue(calculator.isPrime(2));
        Assert.assertTrue(calculator.isPrime(3));
        Assert.assertTrue(calculator.isPrime(5));
        Assert.assertTrue(calculator.isPrime(7));

        Assert.assertFalse(calculator.isPrime(4));
        Assert.assertFalse(calculator.isPrime(6));
        Assert.assertFalse(calculator.isPrime(9));
        Assert.assertFalse(calculator.isPrime(10));
    }

}
