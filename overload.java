class Calculater{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}
public class overload {
    public static void main(String[] args) {
        Calculater calc = new Calculater();
        System.out.println(calc.add(5, 10));
        System.out.println(calc.add(5, 10, 15));
    }
}
