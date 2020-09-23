import java.util.List;

/**
 * gradingStudents
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date 23.9.2020
 * <p>
 * https://www.hackerrank.com/challenges/grading/problem
 */


public class gradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        System.out.println(grades);
        int size = grades.size();
        for (int i = 0; i < size; i++) {
            if (grades.get(i) >= 38) {
                if (3 == grades.get(i) % 10) {
                    grades.set(i, grades.get(i) + 2);
                }
                if (4 == grades.get(i) % 10) {
                    grades.set(i, grades.get(i) + 1);
                }
                if (8 == grades.get(i) % 10) {
                    grades.set(i, grades.get(i) + 2);
                }
                if (9 == grades.get(i) % 10) {
                    grades.set(i, grades.get(i) + 1);
                }
            }
        }
        System.out.println(grades);
        return grades;
    }
}
