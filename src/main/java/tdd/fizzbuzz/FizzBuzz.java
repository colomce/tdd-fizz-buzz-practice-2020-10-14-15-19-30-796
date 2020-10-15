package tdd.fizzbuzz;

public class FizzBuzz {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZ_BUZZ = "FizzBuzz";
    private static final String FIZZ_WHIZZ = "FizzWhizz";
    private static final int MODULO_3 = 3;
    private static final int MODULO_5 = 5;
    private static final int MODULO_7 = 7;

    public String countOff(int orderNumber) {

        boolean multipleOfThree = orderNumber % MODULO_3 == 0;
        boolean multipleOfFive = orderNumber % MODULO_5 == 0;
        boolean multipleOfSeven = orderNumber % MODULO_7 == 0;

        if (multipleOfThree && multipleOfFive && multipleOfSeven) {
            return "FizzBuzzWhizz";
        }

        if (multipleOfThree && multipleOfFive) {
            return FIZZ_BUZZ;
        }

        if (multipleOfThree && multipleOfSeven) {
            return FIZZ_WHIZZ;
        }

        if (multipleOfThree) {
            return FIZZ;
        }

        if (multipleOfFive) {
            return BUZZ;
        }
        return String.valueOf(orderNumber);
    }
}
