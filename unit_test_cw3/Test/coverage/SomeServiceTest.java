package coverage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomeServiceTest {
    private SomeService someService;

    @BeforeEach
    void setUp() {
        someService = new SomeService();
    }

    @Test
    void multiplayTreeNotFiveReturnsFizz() {
        assertEquals("Fizz", someService.fizzBuzz(3));
    }

    @Test
    void multiplayFiveNotTreeReturnBuzz() {
        assertEquals("Buzz", someService.fizzBuzz(5));
    }

    @Test
    void multiplayTreeAndFiveReturnFizzBuzz() {
        assertEquals("FizzBuzz", someService.fizzBuzz(15));
    }

    @Test
    void NotMultiplayTreeAndFiveReturnNumber() {
        assertEquals(Integer.toString(1), someService.fizzBuzz(1));
    }

    @Test
    void firstLast6() {
        assertTrue(someService.firstLast6(new int []{6,4,5}));
        assertTrue(someService.firstLast6(new int []{2,4,6}));
        assertFalse(someService.firstLast6(new int []{1,4,2}));
    }


}