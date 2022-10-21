package folder.teacher;

import java.util.Arrays;
import java.util.Random;

/**
 * Teacher class.
 */
public class Teacher implements Examiner{
    /**
     * Method for creating exams for student.
     * @return exam
     * Returns a new exam.
     */
    public Exam createExam() {
        Random random = new Random();
        String[] answers = new String[3];
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
            }
        }

        return new Exam(answers);
    }
    /**
     * Method for checking student's exam.
     *
     * @param exam Student's exam.
     */
    public void checkExam(final Exam exam) {
        String[] answers = exam.getAnswers();
        String[] goodAnswers = exam.getGoodAnswers();
        int points = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i].equals(goodAnswers[i])) {
                points++;
            }
        }
        System.out.println("Teacher is checking exam. Student answers: "
                + Arrays.toString(answers)
                + " : Correct answers: "
                + Arrays.toString(goodAnswers)
                + " Points: "
                + points
                + "/3");
    }
}
