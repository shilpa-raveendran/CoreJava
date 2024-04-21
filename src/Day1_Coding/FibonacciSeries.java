package Day1_Coding;

public class FibonacciSeries {
    public static void main(String[] args) {
        int count = 7;
        int a = 0;
        int b = 1;
        System.out.print(a + ", " + b + ", ");

        while(count > 0) {
            int sum = a + b;
            System.out.print(sum + ", ");
            a = b;
            b = sum;
            --count;
        }

        System.out.println();
        int newCount = 7;
        int num1 = 0;
        int num2 = 1;
        System.out.print(num1 + ", " + num2 + ", ");

        for(int i = 2; i < newCount; ++i) {
            int sum = num1 + num2;
            System.out.print(sum + ", ");
            num1 = num2;
            num2 = sum;
        }

    }
}