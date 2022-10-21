package folder.teacher;

public interface Examiner {
    public Exam createExam();
    public void checkExam(final Exam exam);
}
