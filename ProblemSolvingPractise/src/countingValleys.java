/**
 * countingValleys
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date 23.09.2020
 * <p>
 * https://www.hackerrank.com/challenges/counting-valleys/problem
 */


public class countingValleys {

    public static int countingValleys(int steps, String path) {
        int seelevel = 0;
        int countValley = 0;
        for (char ch : path.toCharArray()) {
            if (ch == 'U') {
                seelevel++;
            }
            if (ch == 'D') {
                if (seelevel == 0) {
                    countValley++;
                }
                seelevel--;
            }
        }
        return countValley;
    }
}
