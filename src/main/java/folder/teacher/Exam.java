package folder.teacher;

/**
 * Class for exams.
 */
public class Exam {
    /**
     * Array of good answer Strings.
     */
    private final String[] goodAnswers;
    /**
     * Array of student's answers.
     */
    private String[] answers;

    /**
     * Constructor.
     * @param goodAnswers
     * Good answers.
     */
    Exam(final String[] goodAnswers) {
        this.goodAnswers = goodAnswers;
    }

    /**
     * Getter for good answers.
     * @return
     * Returns array String of good answers.
     */
    String[] getGoodAnswers() {
        return goodAnswers;
    }

    /**
     * Getter for student's answers.
     * @return
     * Returns array String of student's answers.
     */
    public String[] getAnswers() {
        return answers;
    }

    /**
     * Save student's answers method.
     * @param answers
     * Student's answers.
     */
    public void setAnswers(final String[] answers) {
        this.answers = answers;
    }
}
