package Day1_Coding;

public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        long factorial = 1L;

        for(int i = 1; i <= num; ++i) {
            factorial *= (long)i;
        }

        System.out.println("Factorial of " + num + " is : " + factorial);
    }
}