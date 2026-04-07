class user{
    String name;
    int age;
    String location;
}
class subscriber extends user{
    int duration;
    String paymentMethod;

}
class paymentDetails extends subscriber{
    String status;
    String expiryDate;
    String name;
    int age;
    String location;
}

public class inheritance {
    public static void main(String[] args) {
        paymentDetails p = new paymentDetails();
        p.name = "John Doe";
        p.age = 30;
        p.location = "New York";
        p.duration = 12;
        p.paymentMethod = "Credit Card";
        p.status = "Active";
        p.expiryDate = "2024-12-31";

        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println( p.location);
        System.out.println(p.duration + " months");
        System.out.println( p.paymentMethod);
        System.out.println( p.status);
        System.out.println(p.expiryDate);
    }

        
    
}
