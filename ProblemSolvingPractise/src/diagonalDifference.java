import java.util.List;

/**
 * diagonalDifference
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date 22.09.2020
 *
 * https://www.hackerrank.com/challenges/diagonal-difference?h_r=profile
 */


public class diagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int result;
        int einfachediagionale = 0;
        int schwerediagionale = 0;

        for (int i = 0; i < arr.size(); i++) {
            einfachediagionale = einfachediagionale + arr.get(i).get(i);
        }
        for (int i = 0; i < arr.size(); i++) {
            schwerediagionale = schwerediagionale + arr.get(i).get((arr.size() - 1) - i);
        }


        result = einfachediagionale - schwerediagionale;
        if (result < 1) {
            result = schwerediagionale - einfachediagionale;
        }

        return result;
    }
}
