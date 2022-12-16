import java.util.*;
public class Q9 {
    public static int encodeLiteral(String data){
        int encode = 0, i = 0;
        while(i < data.length()){
            encode += ((int)(data.charAt(i)) % 64);
            i++;
        }
        return encode;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to encode it: ");
        String decodeString = sc.nextLine();
        System.out.println("The encoded string is: " + encodeLiteral(decodeString));
        sc.close();
    }
}
