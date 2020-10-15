package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void should_return_1_when_countOff_given_orderNumber_1() {
        //Given
        String orderNumber = "1";
        FizzBuzz fizzBuzz = new FizzBuzz();

        //When
        String actual = fizzBuzz.countOff(orderNumber);

        //Then
        assertEquals("1", actual);
    }
}

