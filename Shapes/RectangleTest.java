import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class RectanglesTest {
    Rectangle rectangle;
    @Nested
    class TestArea{

        @Test
        public void checkAreaIsTenWhenLengthIsTwoAndBreadthIsFive(){
            rectangle=new Rectangle(2,5);
            double actualArea = rectangle.area();
            double expectedArea = 10;
            assertEquals(expectedArea , actualArea);
        }

        @Test
        public void checkAreaIsErrorWhenLengthIsMinusTwoAndBreadthIsFive(){

            assertThrows(IllegalArgumentException.class, () -> new Rectangle(-2,5));
        }
        @Test
        public void checkAreaIsErrorWhenLengthIsMinusTwoAndBreadthIsString(){
            rectangle=new Rectangle(9,3);
            assertThrows(IllegalArgumentException.class, () -> new Rectangle(-2,5));
        }
    }

    @Nested
    class TestPerimeter{

        @Test
        public void checkPerimeterIsFourteenWhenLengthIsTwoANdBreadthIsFive(){
            rectangle=new Rectangle(2,5);
            double actualPerimeter = rectangle.perimeter();
            double expectedPerimeter = 14;
            assertEquals(expectedPerimeter , actualPerimeter);
        }
    }

}
