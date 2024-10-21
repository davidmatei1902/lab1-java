package lab1.task2;
import java.util.concurrent.TimeUnit;


public class JobMarket {

    public static void main(String[] args) {
        Student Gigel = new Student();
        Student Marcel = new Student();
        Student Dorel = new Student();
        Student Ionel = new Student();
        Gigel.grade = 5.0f;
        Marcel.grade = 5.0f;
        Dorel.grade = 10.0f;
        Ionel.grade = 9.0f;

        Internship Google = new Internship();
        Google.minGrade = 8.0f;
        Google.setName("Google");

        Internship Amazon = new Internship();
        Amazon.minGrade = 9.0f;
        Amazon.setName("Amazon");

        Internship Facebook = new Internship();
        Facebook.minGrade = 7.0f;
        Facebook.setName("Facebook");

        Internship Microsoft = new Internship();
        Microsoft.minGrade = 5.0f;
        Microsoft.setName("Microsoft");

        String s1 = "Gigel";
        String s2 = "Marcel";
        String s3 = "Dorel";
        String s4 = "Ionel";
        String[] arr = {s1, s2, s3, s4};
        double[] grades = {Gigel.grade, Marcel.grade, Dorel.grade, Ionel.grade};

        Google.setStudents(arr, grades);
        Amazon.setStudents(arr, grades);
        Facebook.setStudents(arr, grades);
        Microsoft.setStudents(arr, grades);

        Google.chooseCandidatesForInterview();
        System.out.println("\n");

        Facebook.chooseCandidatesForInterview();
        System.out.println("\n");

        Microsoft.chooseCandidatesForInterview();
        System.out.println("\n");

        try {
            // Make the application wait for 5 seconds (5000 milliseconds)
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
