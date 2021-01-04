package com.example.calculator;

import org.junit.Test;
import java.lang.ArithmeticException;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class CalculatorUnitTest {
    @Test
    public void twoNegativeNumbersAdditionInCalculateFuntion() {
        final float firstNo = -35;
        final float secondNo = -159;
        float actualnResult = CalculationFunctions.calculate('+',firstNo, secondNo);
        float expectedResult = -194;

        assertEquals(expectedResult, actualnResult,0);
    }
    @Test
    public void twoNegativeNumbersSubtractionInCalculateFuntion() {
        final float firstNo = -35;
        final float secondNo = -159;
        float actualnResult = CalculationFunctions.calculate('-',firstNo, secondNo);
        float expectedResult = 124;

        assertEquals(expectedResult, actualnResult,0);
    }
    @Test
    public void twoNegativeNumbersMultiplicationInCalculateFuntion() {
        final float firstNo = -35;
        final float secondNo = -159;
        float actualnResult = CalculationFunctions.calculate('*',firstNo, secondNo);
        float expectedResult = 5565;

        assertEquals(expectedResult, actualnResult,0);
    }
    @Test
    public void twoNegativeNumbersDivisionInCalculateFuntion() {
        final float firstNo = -35;
        final float secondNo = -159;
        float actualnResult = CalculationFunctions.calculate('/',firstNo, secondNo);
        float expectedResult = (float) 0.220125786163522;

        assertEquals(expectedResult, actualnResult,0);
    }
    @Test
    public void onePositiveOneNegativeNumbersAdditionInCalculateFuntion() {
        final float firstNo = 35;
        final float secondNo = -159;
        float actualnResult = CalculationFunctions.calculate('+',firstNo, secondNo);
        float expectedResult = -124;

        assertEquals(expectedResult, actualnResult,0);
    }
    @Test
    public void onePositiveOneNegativeNumbersSubtractionInCalculateFuntion() {
        final float firstNo = 35;
        final float secondNo = -159;
        float actualnResult = CalculationFunctions.calculate('-',firstNo, secondNo);
        float expectedResult = 194;

        assertEquals(expectedResult, actualnResult,0);
    }
    @Test
    public void onePositiveOneNegativeNumbersMultiplicationInCalculateFuntion() {
        final float firstNo = 35;
        final float secondNo = -159;
        float actualnResult = CalculationFunctions.calculate('*',firstNo, secondNo);
        float expectedResult = -5565;

        assertEquals(expectedResult, actualnResult,0);
    }
    @Test
    public void onePositiveOneNegativeNumbersDivisionInCalculateFuntion() {
        final float firstNo = 35;
        final float secondNo = -159;
        float actualnResult = CalculationFunctions.calculate('/',firstNo, secondNo);
        float expectedResult = -0.220125786163522f;

        assertEquals(expectedResult, actualnResult,0);
    }
    @Test
    public void oneNegativeOneZeroValueNumbersAdditionInCalculateFuntion() {
        final float firstNo = 35;
        final float secondNo = 0;
        float actualnResult = CalculationFunctions.calculate('+',firstNo, secondNo);
        float expectedResult = 35;

        assertEquals(expectedResult, actualnResult,0);
    }
    @Test
    public void oneNegativeOneZeroValueNumbersSubtractionInCalculateFuntion() {
        final float firstNo = 35;
        final float secondNo = 0;
        float actualnResult = CalculationFunctions.calculate('-',firstNo, secondNo);
        float expectedResult = 35;

        assertEquals(expectedResult, actualnResult,0);
    }
    @Test
    public void oneNegativeOneZeroValueNumbersMultiplicationInCalculateFuntion() {
        final float firstNo = 35;
        final float secondNo = 0;
        float actualnResult = CalculationFunctions.calculate('*',firstNo, secondNo);
        float expectedResult = 0;

        assertEquals(expectedResult, actualnResult,0);
    }
    @Test
    public void oneNegativeOneZeroValueNumbersDivisionInCalculateFuntion() { //The test fails because of division by zero.
        final float firstNo = 35;                                           // Such action is not allowed by input validation in the MainActivity,
        final float secondNo = 0;                                           // before that input is submitted to the calculate function in the CalculationFunctions class
        float actualnResult = CalculationFunctions.calculate('/',firstNo, secondNo); //There won't be further tests with division from zero
        String expectedResult = "infinity";

        assertEquals(expectedResult, actualnResult,0);
    }
    @Test
    public void twoZeroValueNumbersAdditionInCalculateFuntion() {
        final float firstNo = 0;
        final float secondNo = 0;
        float actualnResult = CalculationFunctions.calculate('+',firstNo, secondNo);
        float expectedResult = 0;

        assertEquals(expectedResult, actualnResult,0);
    }
    @Test
    public void twoZeroValueNumbersSubtractionInCalculateFuntion() {
        final float firstNo = 0;
        final float secondNo = 0;
        float actualnResult = CalculationFunctions.calculate('-',firstNo, secondNo);
        float expectedResult = 0;

        assertEquals(expectedResult, actualnResult,0);
    }
    @Test
    public void twoZeroValueNumbersMultiplicationInCalculateFuntion() {
        final float firstNo = 0;
        final float secondNo = 0;
        float actualnResult = CalculationFunctions.calculate('*',firstNo, secondNo);
        float expectedResult = 0;

        assertEquals(expectedResult, actualnResult,0);
    }
    @Test
    public void twoPositiveNumbersMultiplicationInCalculateFuntion() {
        final float firstNo = 15;
        final float secondNo = 49;
        float actualnResult = CalculationFunctions.calculate('*',firstNo, secondNo);
        float expectedResult = 735;

        assertEquals(expectedResult, actualnResult,0);
    }
    @Test
    public void twoPositiveNumbersDivisionInCalculateFuntion() {
        final float firstNo = 15;
        final float secondNo = 49;
        float actualnResult = CalculationFunctions.calculate('/',firstNo, secondNo);
        float expectedResult = 0.3061224489795918f;

        assertEquals(expectedResult, actualnResult,0);
    }
    @Test
    public void twoPositiveNumbersAdditionInCalculateFuntion() {
        final float firstNo = 15;
        final float secondNo = 49;
        float actualnResult = CalculationFunctions.calculate('+',firstNo, secondNo);
        float expectedResult = 64;

        assertEquals(expectedResult, actualnResult,0);
    }
    @Test
    public void twoPositiveNumbersSubtractionInCalculateFuntion() {
        final float firstNo = 15;
        final float secondNo = 49;
        float actualnResult = CalculationFunctions.calculate('-',firstNo, secondNo);
        float expectedResult = -34;

        assertEquals(expectedResult, actualnResult,0);
    }
    @Test
    public void PositiveNumberSquareRootInCalculateFuntion() {
        final float firstNo = 25;
        float actualnResult = CalculationFunctions.squareRoot(firstNo);
        float expectedResult = 5;

        assertEquals(expectedResult, actualnResult,0);
    }
    @Test
    public void NegativeNumberSquareRootInCalculateFuntion() {
        final float firstNo = -25;
        float actualnResult = CalculationFunctions.squareRoot(firstNo);
        float expectedResult = 5;

        assertEquals(expectedResult, actualnResult,0);
    }
    @Test
    public void ZeroValueNumberSquareRootInCalculateFuntion() {
        final float firstNo = 0;
        float actualnResult = CalculationFunctions.squareRoot(firstNo);
        float expectedResult = 0;

        assertEquals(expectedResult, actualnResult,0);
    }
}