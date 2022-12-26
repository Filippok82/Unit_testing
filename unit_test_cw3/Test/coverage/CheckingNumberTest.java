package coverage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckingNumberTest {
    private CheckingNumber numbers;

    @BeforeEach
    void setUps() {
        numbers = new CheckingNumber();
    }

    @Test
    void evenNumber(){
     assertTrue(numbers.evenOddNumber(2));
 }
    @Test
    void oddNumber(){
        assertFalse(numbers.evenOddNumber(3));
    }
}