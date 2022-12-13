import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to get it's reverse: ");
        String str = sc.nextLine();
        StringBuffer bufferStr = new StringBuffer(str);
        System.out.println("The reversed string is: " + bufferStr.reverse());

    }
}
