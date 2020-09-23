/**
 * breakingRecords
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date 23.09.2020
 *
 * https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
 */


public class breakingRecords {
    static int[] breakingRecords(int[] scores) {
        int max;
        int min;
        int anzMax= 0;
        int anzMin = 0;
        min = scores[0];
        max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if(scores[i] > max) {
                max = scores[i];
                anzMax++;
            }
            if(scores[i]< min){
                min= scores[i];
                anzMin++;
            }
        }

        int[] result= {anzMax, anzMin};
        return result;
    }
}
