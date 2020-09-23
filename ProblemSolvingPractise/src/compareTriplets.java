import java.util.ArrayList;
import java.util.List;

/**
 * Nicolas Feige
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date 22.9.2020
 * <p>
 * https://www.hackerrank.com/challenges/compare-the-triplets?h_r=profile
 */


public class compareTriplets {

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> output = new ArrayList();
        output.set(0, 0);
        output.set(1, 0);

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                output.set(0, output.get(0) + 1);
            }
            if (a.get(i) < b.get(i)) {
                output.set(1, output.get(1) + 1);
            }
        }
        return output;
    }
}
