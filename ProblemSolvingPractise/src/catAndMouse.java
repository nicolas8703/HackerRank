/**
 * catAndMouse
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date 23.09.2020
 * <p>
 * https://www.hackerrank.com/challenges/cats-and-a-mouse/problem
 */


public class catAndMouse {
    static String catAndMouse(int x, int y, int z) {
        if (x == y) {
            return "Mouse C";
        } else if (Math.abs(x - z) == Math.abs(y - z)) {
            return "Mouse C";
        } else if (Math.abs(x - z) > Math.abs(y - z)) {
            return "Cat B";
        } else {
            return "Cat A";
        }
    }
}
