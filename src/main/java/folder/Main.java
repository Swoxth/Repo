package folder;

import folder.teacher.Exam;
import folder.teacher.Teacher;

/**
 * Main class.
 */
public class Main {
    /**
     * @param args
     * Main method.
     */
    public static void main(final String[] args) {
        System.out.println("Simple program running3.");
        Teacher teacher = new Teacher();
        Student student = new Student();
        Exam exam = teacher.createExam();
        student.solveExam(exam);
        teacher.checkExam(exam);
    }
}
