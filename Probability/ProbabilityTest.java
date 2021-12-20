import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProbabilityTest {
    @DisplayName("Probability of Head or Tails on a single coin toss")
    @Test
    public void probabilityOfHeadAndTailInSingleTossIsEqual(){
        Probability probability=new Probability();
        double answer=probability.singleToss("H");
        double expectedAnswer = probability.singleToss("T");
        assertEquals(answer, expectedAnswer);
    }
    @DisplayName("Probability of Head or Tails on a double coin toss")
    @Test
    public void probabilityOfHeadAndTailInDoubleTossIsEqual(){
        Probability probability=new Probability();
        double answer=probability.doubleToss("H");
        double expectedAnswer = probability.doubleToss("T");
        assertEquals(answer, expectedAnswer);
    }
    @DisplayName("Probability of two events occurring together")
    @Test
    public void probabilityOfHeadAndHead(){
        Probability probability = new Probability();
        double answer = probability.doubleToss("HH");
        double expectedAnswer=1/4;
        assertEquals(answer, expectedAnswer);
    }
    @Test
    public void probabilityOfTailAndTail(){
        Probability probability = new Probability();
        double answer = probability.doubleToss("TT");
        double expectedAnswer=1/4;
        assertEquals(answer, expectedAnswer);
    }
    @DisplayName("Probability of either two events occurring")
    @Test
    public void probabilityOfHeadAndTail(){
        Probability probability = new Probability();
        double answer = probability.doubleToss("HT");
        double expectedAnswer=2/4;
        assertEquals(answer, expectedAnswer);
    }

    @DisplayName("Probability of an event not occurring")
    @Test
    public void probabilityOfHeadNotOccurringInSingleToss(){
        Probability probability = new Probability();
        double answer = 1-probability.singleToss("H");
    }
    @Test
    public void probabilityOfHeadNotOccurringInDoubleToss(){
        Probability probability = new Probability();
        double answer = 1-probability.doubleToss("H");
    }
    @DisplayName("Check Exception for Invalid Toss Output")
    @Test
    public void checkExceptionForSingleToss() {
        assertThrows(IllegalArgumentException.class, () -> {
                    Probability probability = new Probability();
                    probability.singleToss("Z");
                }
        );
    }

    @Test
    public void checkExceptionForDoubleToss(){
        assertThrows(IllegalArgumentException.class, () -> {
                    Probability probability = new Probability();
                    probability.doubleToss("ZT");
                }
        );
    }
}
