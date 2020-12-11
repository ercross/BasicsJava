public class Fibonacci {

    static int sumFibonnacci(int limit) {
        int previousNumber = 0;
        int currentNumber = 1;
        int sum = 0;

        while (currentNumber <= limit) {
            if (currentNumber %2 != 0) {
                sum += currentNumber;
            }
            currentNumber += previousNumber;
            previousNumber = currentNumber - previousNumber;
        }
        return sum;
    }

    public static void main (String[] args) {
        System.out.println(sumFibonnacci(10000));
    }
}
