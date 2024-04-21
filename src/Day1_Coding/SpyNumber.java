package Day1_Coding;
public class SpyNumber {
    public static void main(String[] args) {
        int num = 123;
        if (sumOfDigits(num) == prodOfDigits(num)) {
            System.out.print(num + " is a Spy number");
        } else {
            System.out.print(num + " is not a Spy number");
        }

    }

    private static int prodOfDigits(int num) {
        int prod;
        for(prod = 1; num > 0; num /= 10) {
            int digit = num % 10;
            prod *= digit;
        }

        return prod;
    }

    private static int sumOfDigits(int num) {
        int sum;
        for(sum = 0; num > 0; num /= 10) {
            int digit = num % 10;
            sum += digit;
        }

        return sum;
    }
}