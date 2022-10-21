package folder;

import folder.teacher.Exam;

import java.util.Random;

public class Student {

    /**
     * Method for filling an exam.
     * @param exam Exam to fill.
     */
    public void solveExam(final Exam exam) {
        String[] answers = new String[3];
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            switch (random.nextInt(3)) {
                case 0:
                    answers[i] = "A";
                    break;
                case 1:
                    answers[i] = "B";
                    break;
                case 2:
                    answers[i] = "C";
                    break;
                default :
                    answers[i] = "unanswered";
            }
        }
        exam.setAnswers(answers);
    }
}
