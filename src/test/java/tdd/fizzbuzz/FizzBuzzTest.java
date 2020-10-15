package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void should_return_1_when_countOff_given_orderNumber_1() {
        //Given
        int orderNumber = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //When
        String actual = fizzBuzz.countOff(orderNumber);

        //Then
        assertEquals("1", actual);
    }

    @Test
    void should_return_Fizz_when_countOff_given_orderNumber_3() {
        //Given
        int orderNumber = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //When
        String actual = fizzBuzz.countOff(orderNumber);

        //Then
        assertEquals("Fizz", actual);
    }

    @Test
    void should_return_Buzz_when_countOff_given_orderNumber_10() {
        //Given
        int orderNumber = 10;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //When
        String actual = fizzBuzz.countOff(orderNumber);

        //Then
        assertEquals("Buzz", actual);
    }

    @Test
    void should_return_FizzBuzz_when_countOff_given_orderNumber_15() {
        //Given
        int orderNumber = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //When
        String actual = fizzBuzz.countOff(orderNumber);

        //Then
        assertEquals("FizzBuzz", actual);
    }

    @Test
    void should_return_FizzWhizz_when_countOff_given_orderNumber_21() {
        //Given
        int orderNumber = 21;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //When
        String actual = fizzBuzz.countOff(orderNumber);

        //Then
        assertEquals("FizzWhizz", actual);
    }
}

