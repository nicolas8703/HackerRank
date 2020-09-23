import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * miniMaxSum
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date 22.09.2020
 * <p>
 * https://www.hackerrank.com/challenges/mini-max-sum?h_r=profile
 */


public class miniMaxSum {

    //Only 9 points because it is not optimised for a large quantity
    static void miniMaxSum(int[] arr) {
        List<Long> temp = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            temp.add((long) arr[i]);
        }
        Collections.sort(temp);

        System.out.println(temp);
        long minimum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            minimum = minimum + temp.get(i);
        }
        long maximum = 0;
        for (int i = 1; i < arr.length; i++) {
            maximum = maximum + temp.get(i);
        }
        System.out.println(minimum + " " + maximum);
    }
}
