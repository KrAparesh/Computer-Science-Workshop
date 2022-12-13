import java.util.*;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();
        String[] strArray = str.split(" ");
        System.out.println("The number of words in the sentence is: " + strArray.length);
        sc.close();
    }
}