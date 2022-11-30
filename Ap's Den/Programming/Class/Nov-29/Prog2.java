public class Prog2 {
    private int a;

    Prog2(){
        System.out.println("Hi! This is an non-parameterized constructor");
    }

    Prog2(int a) {
        this();
        System.out.println("Parameterized Constructor called");
    }

    public static void main(String[] args) {
        Prog2 ob = new Prog2(4);
        System.out.println("Program ended successfully");
        System.out.println("Variable called: "+ob.a);
    }
}
