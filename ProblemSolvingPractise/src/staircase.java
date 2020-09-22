/**
 * staircase
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date 22.09.2020
 */


public class staircase {

    static void staircase(int n) {
        String ausgabe = "";
        for (int j = 1; j <= n; j++) {
            for (int i = j; i > 0; i--) {
                for (int k = j; k < n; k++) {
                    if (!ausgabe.contains("#")) {
                        ausgabe = ausgabe + " ";
                    }
                }
                ausgabe = ausgabe + "#";
            }
            System.out.println(ausgabe);
            ausgabe = "";
        }
    }
}
