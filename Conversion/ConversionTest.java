import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ConversionTest {
    Conversion con;
    @Nested
    class simpleConversion {
        @Test
        public void checkWhetherCentiMeterAndMeterAreEqual() {
            con = new Conversion(1);
            double actualValue = con.cmToMeter();
            double expectedValue = 0.01;
            assertEquals(expectedValue, actualValue);
        }

        @Test
        public void checkWhetherCentieterAndCentimeterAreEqual() {
            con = new Conversion(1);
            double actualValue = con.cmToCm();
            double expectedValue = 1;
            assertEquals(expectedValue, actualValue);
        }

        @Test
        public void checkWhetherKilometerAndCentimeterAreEqual() {
            con = new Conversion(1);
            double actualvalue = con.cmToKm();
            double expectedvalue = 1.0E-4;
            assertEquals(expectedvalue, actualvalue);
        }

        @Test
        public void checkErrorWhenValueIsMinus() {

            assertThrows(ArithmeticException.class, () -> new Conversion(-2));
        }

        @Test
        public void checkWhetherMeterAndCentimeterAreEqual() {
            con = new Conversion(1);
            double actualvalue = con.meterToCm();
            double expectedvalue = 100;
            assertEquals(expectedvalue, actualvalue);
        }
    }
        @Nested
        class addition {
            @Test
            public void checkOneMeterPlusHundredCentimeterIsTwoMeter() {
                con = new Conversion(1, 100);
                double answer = con.additionMeterAndCentimeter();
                double expected = 2;
                assertEquals(expected, answer);
            }

            @Test
            public void checkTwoHundredCentimeterAndOneKilometerGivesOneLakhAndTwoHundred() {
                con = new Conversion(200, 1);
                double answer = con.additionKilometerAndCentimeter();
                double expected = 100200;
                assertEquals(expected, answer);
            }
        }

    @Nested
    class Subtraction {
        @Test
        public void checkOneMeterAndFiftyCentimeterMinusIsZeroPointFiveMeter() {
            con = new Conversion(1, 50);
            double answer = con.subtractMeterAndCentimeter();
            double expected = 0.5;
            assertEquals(expected, answer);

        }
        @Test
        public void checkTwoThousandCentimeterAndOneMeterMinusIsThousandNineHundred() {
            con = new Conversion(2000,1);
            double answer = con.subtractCentimeterAndMeter();
            double expected = 1900;
            assertEquals(expected, answer);

        }

    }
    @Nested
    class Weightconversion {
        @Test
        public void checkWhetherGramAndGramAreEqual() {
            con = new Conversion(1);
            double actualvalue = con.gramToGram();
            double expectedvalue = 1;
            assertEquals(expectedvalue, actualvalue);
        }

        @Test
        public void checkWhetherZeroPointOneKilogramIsEqualToHundredGram() {
            con = new Conversion(0.1);
            double actualvalue = con.kilogramToGram();
            double expectedvalue = 100;
            assertEquals(expectedvalue, actualvalue);
        }

        @Test
        public void checkWhetherTenGramPlusOneKilogramGivesThousandAndTenGram() {
            con = new Conversion(10, 1);
            double actualvalue = con.addGramAndKilogramToGram();
            double expectedvalue = 1010;
            assertEquals(expectedvalue, actualvalue);
        }

        @Nested
        class Subtraction {
            @Test
            public void checkWhetherOnePointFiveKilogramMinusFiveHundredGramGivesOneKilogram() {
                con = new Conversion(1.5, 500);
                double actualvalue = con.subtractKilogramAndGramToKilogram();
                double expectedvalue = 1;
                assertEquals(expectedvalue, actualvalue);
            }
        }
    }
}
