import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciFastAlgorithm {

    private static BigInteger calc_fib(int n) {

        ArrayList<BigInteger> fibNum = new ArrayList<BigInteger>(n);

        fibNum.add(0, BigInteger.valueOf(0));
        fibNum.add(1, BigInteger.valueOf(1));

        for (int i = 2; i <= n; i++) {
            fibNum.add(i, (BigInteger) fibNum.get(i - 1).add((BigInteger) fibNum.get(i - 2)));
        }

        return fibNum.get(n);

    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(calc_fib(n));
    }

}