package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(String orderNumber) {
        int number = Integer.parseInt(orderNumber);

        if(number % 3 == 0) {
            return "Fizz";
        }
        return orderNumber;
    }
}
