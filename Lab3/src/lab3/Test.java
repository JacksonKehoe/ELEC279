package lab3;
public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("Julia", "181 University Ave.", 121456);
        System.out.println(p1.toString());
        Student s1 = new Student("John", "189 Univerity Ave.", 246718);
        s1.addGrade("ELEC279", 97);
        s1.addGrade("ELEC221", 68);
        System.out.println(s1.toString());
        s1.printGrades();

        GradStudent s2 = new GradStudent("Tom", "92 Reg. St.", 1014);
        System.out.println(s2);
        s2.addGrade("ELEC 279", 97);
        s2.addGrade("ELEC 271", 88);
        s2.setNumCommitteeMembers(6);
        s2.addGrade("CompI", "PASS");
        s2.addGrade("CompII", "PASS");
        s2.addGrade("Thesis Defense first trial", "FAIL");
        s2.addGrade("Thesis Defense second trial", "FAIL");
        s2.printExamGrades();
        s2.printGrades();
    }
}