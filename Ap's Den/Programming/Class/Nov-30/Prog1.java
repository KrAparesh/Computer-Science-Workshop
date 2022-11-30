class A {
    public int a = 10;

    void show() {
        System.out.println(a);
    }
}

class B extends A {
    int a = 20;
    void show() {
        System.out.println(a);
        System.out.println(super.a);
    }
}

public class Prog1 {
    public static void main(String[] args) {
        B ob = new B();
        ob.show();
    }
}
