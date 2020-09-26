package lab3;
public class GradStudent extends Student {
    private static int maxExamAttempts = 6;
    private int examAttempts;
    private int numCommitteeMembers;
    private String[] exams;
    private String[] examResults;

    public GradStudent(String name, String address, int idNum) {
        super(name, address, idNum);
        examAttempts = 0;
        maxExamAttempts = 6;
        numCommitteeMembers = 0;
        exams = new String[maxExamAttempts];
        examResults = new String[maxExamAttempts];
    }

    public int getNumCommitteeMembers() {
        return numCommitteeMembers;
    }

    public void setNumCommitteeMembers(int numCommitteeMembers) {
        this.numCommitteeMembers = numCommitteeMembers;
    }

    public void addGrade(String exam, String result) {
        if (examAttempts < maxExamAttempts) {
            exams[examAttempts] = exam;
            examResults[examAttempts] = result;
            examAttempts++;
        }
    }

    @Override
    public String toString() {
        return "Grad_" + super.toString();
    }

    public void printExamGrades() {
        for (int i = 0; i < examAttempts; i++) {
            System.out.println(exams[i] + ": " + examResults[i]);
        }
    }
}
