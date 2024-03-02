package LeetCode;

public class HappyNumber {
    public static void main(String[] args) {
        int number = 9; // Example: 19 is a happy number
        boolean isHappy = isHappyNumber(number);
        if (isHappy) {
            System.out.println(number + " is a happy number.");
        } else {
            System.out.println(number + " is not a happy number.");
        }
    }

    public static boolean isHappyNumber(int n) {
        int slow = n, fast = n;
        do {
            slow = calculateSumOfSquares(slow);
            fast = calculateSumOfSquares(calculateSumOfSquares(fast));
        } while (slow != fast);

        System.out.println(slow+ "-->"+fast);
        return slow == 1;
    }

    public static int calculateSumOfSquares(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}

