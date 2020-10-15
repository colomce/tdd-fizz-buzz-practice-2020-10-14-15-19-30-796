package tdd.fizzbuzz;

public class FizzBuzz {

    private static final String FIZZ = "Fizz";
    private static final int MODULO_3 = 3;

    public String countOff(int orderNumber) {
        if (orderNumber % MODULO_3 == 0) {
            return FIZZ;
        }
        return String.valueOf(orderNumber);
    }
}
