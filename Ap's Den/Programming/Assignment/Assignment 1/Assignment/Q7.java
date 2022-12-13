import java.util.*;
public class Q7 {
    public static String createPass(String name, String DOB){
        if(name == null || DOB.length() != 10)
            return "Invalid input";
        String password = "";
        password += name.toUpperCase().substring(0, 2) + DOB.substring(3, 5);
        return password;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your DOB (DD/MM/YYYY): ");
        String DOB = sc.nextLine();
        System.out.println("Your password is: " + createPass(name, DOB));
        sc.close();
    }
}
