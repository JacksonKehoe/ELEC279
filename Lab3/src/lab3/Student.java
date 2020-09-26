package lab3;
public class Student extends Person {
    private static final int maxCourses = 20;
    private int numCourses = 0;
    private String[] courseCodes;
    private int[] grades;

    public Student(String name, String address, int idNum) {
        super(name, address, idNum);
        courseCodes = new String[maxCourses];
        grades = new int[maxCourses];
    }

    @Override
    public String toString() {
        return "Student: " + super.toString();
    }

    public void addGrade(String courseCode, int grade) {
        if (numCourses < maxCourses) {
            courseCodes[numCourses] = courseCode;
            grades[numCourses] = grade;
            numCourses++;
        } else {
            System.out.println("Error");
        }
    }

    public void printGrades() {
        for (int i = 0; i < numCourses; i++) {
            System.out.println(courseCodes[i] + ": " + grades[i]);
        }
    }

}