package ru.geekbrains.coverage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SomeServiceTest {
    private SomeService someService;

    @BeforeEach
    void setUp() {
        someService = new SomeService();
    }

    @Test
    void multiplayTreeNotFiveReturnsFizz() {
        Assertions.assertEquals("Fizz", someService.fizzBuzz(3));
    }

    @Test
    void multiplayFiveNotTreeReturnBuzz() {
        Assertions.assertEquals("Buzz", someService.fizzBuzz(5));
    }
    @Test
    void multiplayTreeAndFiveReturnFizzBuzz() {
        Assertions.assertEquals("FizzBuzz", someService.fizzBuzz(15));
    }

//    @Test
//    void NotMultiplayTreeAndFiveReturnFizzBuzz(){
//        assertEquals(Integer,someService.fizzBuzz(15));}
}