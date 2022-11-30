public class Prog1 {

    protected boolean pro_a(){
        return true;
    }

    public boolean pub_b(){
        return true;
    }
    
    private boolean priv_d(){
        return true;
    }
    
    public int a = 1;
    protected int b = 1;
    int c = 1;
    private int d = 1;
    
    public static void main(String[] args) {
        Prog1 ob = new Prog1();
        System.out.println("Protected function is called: " + ob.pro_a());
        System.out.println("Public function is called: " + ob.pub_b());
        System.out.println("Private function is called: " + ob.priv_d() + "\n");

        System.out.println("public variable is called: " + ob.a);
        System.out.println("protected variable is called: " + ob.b);
        System.out.println("default variable is called: " + ob.c);
        System.out.println("private variable is called: " + ob.d);
    }
}