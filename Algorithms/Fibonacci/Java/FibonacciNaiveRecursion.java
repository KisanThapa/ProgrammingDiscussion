import java.util.Scanner;

public class FibonacciNaiveRecursion {

    static long fib(long n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(fib((long) n));
    }
}