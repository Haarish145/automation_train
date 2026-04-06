import java.util.*;

public class Main2 {

    // method with return
    public static String getGrade(int marks) {
        int grade = marks / 10;

        switch (grade) {
            case 10:
            case 9:
                return "Grade: O";
            case 8:
                return "Grade: A";
            case 7:
                return "Grade: B";
            default:
                return "Grade: D";
        }
    }

    public static void main(String[] args) {
        int marks = 76;
        System.out.println(getGrade(marks));
    }
}