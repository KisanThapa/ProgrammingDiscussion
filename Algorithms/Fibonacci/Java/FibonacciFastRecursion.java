import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciFastRecursion {

    public static BigInteger fibRecursion(int fibNum, BigInteger previous, BigInteger current) {
        if (fibNum == 0)
            return previous;

        return fibRecursion(--fibNum, current, (previous.add(current)));
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        BigInteger firstNum = BigInteger.valueOf(0);
        BigInteger secondNum = BigInteger.valueOf(1);

        System.out.println(fibRecursion(n, firstNum, secondNum));

    }

}