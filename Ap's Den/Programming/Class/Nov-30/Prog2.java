class A {
    A() {
        System.out.print("Hello ");
    }
}

class B extends A {
    B() {
        super();
        System.out.println("world");
    }
}

public class Prog2 {
    public static void main(String[] args) {
        B ob = new B();
    }
}