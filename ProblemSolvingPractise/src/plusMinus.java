/**
 * plusMinus
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date 22.09.2020
 *
 * https://www.hackerrank.com/challenges/plus-minus?h_r=profile
 */


public class plusMinus {

    static void plusMinus(int[] arr) {
    int minusCount = 0;
    int zeroCount = 0;
    int plusCount = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == 0) {
            zeroCount++;
        } else if (arr[i] < 0) {
            minusCount++;
        } else if (arr[i] > 0) {
            plusCount++;
        }
    }

    double eins = (double) plusCount / (double) arr.length;
    eins = eins + 0.0000000001;
    System.out.println(eins);

    double zwei = (double) minusCount / (double) arr.length;
    zwei = zwei + 0.0000000001;
    System.out.println(zwei);

    double drei = (double) zeroCount / (double) arr.length;
    drei = drei + 0.0000000001;
    System.out.println(drei);
}
}
