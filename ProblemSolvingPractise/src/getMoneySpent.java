import java.util.Arrays;

/**
 * getMoneySpent
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date 23.09.2020
 * <p>
 * https://www.hackerrank.com/challenges/electronics-shop/problem
 */


public class getMoneySpent {

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int minKeyboards = Arrays.stream(keyboards).min().getAsInt();
        int maxKeyboards = Arrays.stream(keyboards).max().getAsInt();
        int minDrives = Arrays.stream(drives).min().getAsInt();

        if (minDrives + minKeyboards > b) {
            System.out.println(-1);
            return -1;
        }
        int count = 0;
        for (int i = keyboards.length - 1; i >= 0; i--) {
            for (int j = drives.length - 1; j >= 0; j--) {
                if (keyboards[i] + drives[j] <= b) {
                    if (count < keyboards[i] + drives[j]) {
                        count = keyboards[i] + drives[j];
                    }
                }
            }
        }
        return count;
    }
}
