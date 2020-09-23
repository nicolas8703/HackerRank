/**
 * Nicolas Feige
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date 22.9.2020
 * <p>
 * https://www.hackerrank.com/challenges/a-very-big-sum?h_r=profile
 */


public class aVeryBigSum {

    static long aVeryBigSum(long[] ar) {
        long output = 0;
        for (int i = 0; i < ar.length; i++) {
            output = output + ar[i];
        }
        return output;
    }
}
