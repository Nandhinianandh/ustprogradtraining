import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class SquareTest {
    Square square;

    @Nested
    class TestArea {

        @Test
        public void checkAreaIsTenWhenSideIsFour() {
            square = new Square(4);
            double actualArea = square.area();
            double expectedArea = 16;
            assertEquals(expectedArea, actualArea);
        }
    }
    @Test
    public void checkAreaIsTenWhenSideIsFourPointTwo() {
        square = new Square(4.2);
        double actualArea = square.area();
        double expectedArea = 17.64;
        assertEquals(expectedArea, actualArea);
    }
    @Test
    public void checkAreaIsErrorWhenSideIsMinusFour(){

        assertThrows(IllegalArgumentException.class, () -> new Square(-4));
    }
    @Test
    public void checkAreaIsErrorWhenSideIsZero(){

        assertThrows(IllegalArgumentException.class, () -> new Square(0));
    }
    @Nested
    class TestPerimeter{

        @Test
        public void checkPerimeterIsFourteenWhenLengthIsTwoANdBreadthIsFive(){
            square=new Square(5);
            double actualPerimeter = square.perimeter();
            double expectedPerimeter = 20;
            assertEquals(expectedPerimeter , actualPerimeter);
        }
    }
    @Test
    public void checkPerimterIsErrorWhenSideIsZero(){

        assertThrows(IllegalArgumentException.class, () -> new Square(0));
    }

}

