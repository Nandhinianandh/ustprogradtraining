import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class PerimeterTest {
    private PerimeterofRectangle perimeter;

    @BeforeEach
    public void setup() {
        perimeter = new PerimeterofRectangle();
    }

    @Nested
    public class TestingPerimeterofrectangleFunction {
        @Test
        public void LengthsixandwidththreeGiveseighteen() {
            double answer = perimeter.por(6, 3);
            double expected = 18;
            Assertions.assertEquals(answer, expected);

        }
    }
    @Test
    public void lengthThreeAndWidthFourPerimeterIsFourteen(){
        double answer=perimeter.por(3,4);
        double expected=14;
        Assertions.assertEquals(answer,expected);
    }
    @Test
    public void lengthTwoAndWidthSevenPerimeterIsEighteen(){
        double answer=perimeter.por(2,7);
        double expected=18;
        Assertions.assertEquals(answer,expected);
    }
    @Test
    public void lengthTwoPointThreeAndWidthSevenPointFivePerimeterIsNineteenpointSix(){
        double answer=perimeter.por(2.3,7.5);
        double expected=19.6;
        Assertions.assertEquals(answer,expected);
    }
    @Test
    public void lengthTwoPointThreeAndWidthSevenPerimeterIsEighteenPointSix(){
        double answer=perimeter.por(2.3,7);
        double expected=18.6;
        Assertions.assertEquals(answer,expected);
    }
    @Test
    public void throwsArithmeticExceptionIfWidthIsZero(){
        Assertions.assertThrows(ArithmeticException.class, ()->perimeter.por(10,0));

    }
    @Test
    public void throwArithmeticExceptionWhenLengthIsNegative()
    {
        Assertions.assertThrows(ArithmeticException.class,()->perimeter.por(-5,7));
    }
    @Test
    public void throwArithmeticExceptionWhenLengthAndWidthAreEqual()
    {
        Assertions.assertThrows(ArithmeticException.class,()->perimeter.por(6,6));
    }
}


