import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    private Areaofrectangle area;

    @BeforeEach
    public void setup() {
        area = new Areaofrectangle();
    }

    @Nested
    public class TestingAreaofrectangleFunction {
        @Test
        public void lengthSixandwidththreeGiveseighteen() {
            double answer = area.rectangle(6, 3);
            double expected = 18;
            Assertions.assertEquals(answer, expected);

        }
    }
    @Test
    public void lengthThreeAndWidthFourAreaIsTwelve(){
        double answer=area.rectangle(3,4);
        double expected=12;
        Assertions.assertEquals(answer,expected);
    }
    @Test
    public void lengthTwoAndWidthSevenAreaIsFourteen(){
        double answer=area.rectangle(2,7);
        double expected=14;
        Assertions.assertEquals(answer,expected);
    }
    @Test
    public void lengthTwoPointThreeAndWidthSevenPointFiveAreaIsSixteenPointOne(){
        double answer=area.rectangle(2.3,7.5);
        double expected=17.25;
        Assertions.assertEquals(answer,expected);
    }
    @Test
    public void lengthTwoPointThreeAndWidthSevenAreaIsSixteenPointOne(){
        double answer=area.rectangle(2.3,7);
        double expected=16.099999999999998;
        Assertions.assertEquals(answer,expected);
    }
    @Test
    public void throwsArithmeticExceptionIfWidthIsZero(){
        Assertions.assertThrows(ArithmeticException.class, ()->area.rectangle(10,0));

    }
    @Test
    public void throwArithmeticExceptionWhenLengthIsNegative()
    {
        Assertions.assertThrows(ArithmeticException.class,()->area.rectangle(-5,7));
    }
    @Test
    public void throwArithmeticExceptionWhenLengthAndWidthAreEqual()
    {
        Assertions.assertThrows(ArithmeticException.class,()->area.rectangle(6,6));
    }
}

