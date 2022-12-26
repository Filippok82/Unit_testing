package coverage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberIntervalTest {
    private NumberInterval numbers;

    @BeforeEach
    void setUps() {
        numbers = new NumberInterval();
    }
    @Test
    void numberIntervalTrue(){
        assertTrue(numbers.numberInInterval(40));
    }

    @Test
    void numberIntervalFalse(){
        assertFalse(numbers.numberInInterval(10));
        assertFalse(numbers.numberInInterval(110));

    }
}