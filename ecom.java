import java.util.Scanner;

public class ecom {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cart value: ");
        double amount = sc.nextDouble();
        double discount = 50;
        if (amount > 5000) {
            discount = amount * 0.20;
        } else if (amount > 2000) {
            discount = amount * 0.10;
        } else {
            discount = 0;
        }
        double finalAmount = amount - discount;
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Payable Amount: ₹" + finalAmount);
        sc.close();
    }
}