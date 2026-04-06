import java.util.Scanner;

public class smartlogin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String correctPassword = "admin123";
        int attempts = 0;

        while (attempts < 3) {
            System.out.print("Enter password: ");
            String input = sc.nextLine();

            if (input.equals(correctPassword)) {
                System.out.println("Access Granted");
                break;
            } else {
                attempts++;
                System.out.println("Wrong password");

                if (attempts == 3) {
                    System.out.println("Blocked");
                }
            }
        }

        sc.close();
    }
}