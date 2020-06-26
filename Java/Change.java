
import java.util.ArrayList;
import java.util.Scanner;

public class Change {
    private static int getChange(int m) {

        ArrayList<Integer> coinsArray = new ArrayList<Integer>();
        int coinCount = 0;

        while (m >= 10) {
            coinsArray.add(10);
            coinCount++;
            m -= 10;
        }
        while (m >= 5) {
            coinsArray.add(5);
            coinCount++;
            m -= 5;
        }

        while (m >= 1) {
            coinsArray.add(1);
            coinCount++;
            m -= 1;
        }

        System.out.println(coinsArray.toString());
        return coinCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int coins = scanner.nextInt();
        System.out.println(getChange(coins));

    }
}
