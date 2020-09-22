import java.util.Collections;
import java.util.List;

/**
 * birthdayCakeCandles
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date 22.09.2020
 */


public class birthdayCakeCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
        int finished = 0;
        Collections.sort(candles);

        int biggest = candles.get(candles.size() - 1);

        while (candles.contains(biggest)) {
            candles.remove(candles.get(candles.size() - 1));
            finished++;
        }
        return finished;
    }

    public static int birthdayCakeCandles2(List<Integer> candles) {
        int finished = 0;
        int start = candles.get(0);

        for (int i = 0; i < candles.size(); i++) {
            if (start < candles.get(i)) {
                start = Math.max(start, candles.get(i));
            }
        }
        while (candles.contains(start)) {
            candles.remove(candles.get(candles.size() - 1));
            finished++;
        }


        return finished;
    }
}
