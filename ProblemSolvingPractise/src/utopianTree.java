/**
 * utopianTree
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date 23.09.2020
 * <p>
 * https://www.hackerrank.com/challenges/utopian-tree/problem
 */


public class utopianTree {
    static int utopianTree(int n) {
        int treeSize = 1;
        if (n % 2 == 0) {
            for (int i = 0; i < n / 2; i++) {
                treeSize = treeSize * 2;
                treeSize++;
            }
        } else {
            treeSize = treeSize * 2;
            for (int i = 0; i < (n - 1) / 2; i++) {
                treeSize++;
                treeSize = treeSize * 2;
            }
        }
        return treeSize;
    }
}
