import java.util.List;

/**
 * birthday
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date 23.09.2020
 * <p>
 * https://www.hackerrank.com/challenges/the-birthday-bar/problem
 */


public class birthday {

    static int birthday(List<Integer> s, int d, int m) {
        int plus = 0;
        int count = 0;
        int startSize = s.size();
        for (int j = 0; j < startSize; j++) {
            if (m <= s.size()) {
                for (int i = 0; i < m; i++) {
                    plus = plus + s.get(i);
                }
            }
            if (plus == d) {
                count++;
            }
            System.out.println(plus);
            plus = 0;
            s.remove(0);
        }
        return count;
    }
}
