import java.util.ArrayList;
import java.util.List;

/**
 * kangaroo
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date 23.09.2020
 *
 * https://www.hackerrank.com/challenges/kangaroo/problem
 */


public class kangaroo {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        List<Integer> kanguru1 = new ArrayList<>();
        for (int i = 0; i < 10001; i++) {
            if(x1 + v1 * i == x2 + v2 * i){
                return "YES";
            }
        }
        return "NO";
    }
}
