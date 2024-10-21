package lab1.task2;

public class Internship {
    String name;
    double minGrade;
    Student[] students;

    public Student chooseCandidateRandomly() {
        return students[(int) (Math.random() * students.length)];
    }

    public void setStudents(String[] names, double[] grades) {
        students = new Student[names.length];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].name = names[i];
            students[i].grade = grades[i];
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMinGrade(double minGrade) {
        this.minGrade = minGrade;
    }

    public void chooseCandidatesForInterview() {
        for (int i = 0; i < students.length; i++) {
            if (students[i].grade >= minGrade) {
                System.out.println("Candidate " + students[i].name + " got a phone interview at " + name);
                System.out.println("(Min required was " + minGrade + ")");
            }
        }
    }

}
