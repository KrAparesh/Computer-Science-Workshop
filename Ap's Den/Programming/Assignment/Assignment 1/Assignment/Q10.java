import java.util.*;
public class Q10 {
    public static int toBase(int num, int b1, int b2){
        if(b1 == b2)
            return -1;
        if(b1 == 1 || b2 == 1)
            return num;
        if(b1 > b2) {
            String resultString = "";
            while(num != 0){
                resultString += num % b2;
                num /= b2;
            }
            return Integer.parseInt(resultString);
        } else {
            int lastDigit = 0, result = 0, pow = 0; 
            while(num != 0){
                lastDigit = num % 10;
                result += (lastDigit * Math.pow(b2, pow));
                num /= 10;
                pow++;
            }
            return result;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number, base 1, base 2 for conversion: ");
        int num = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        System.out.println("The converted number is: " + toBase(num, b1, b2));
        sc.close();
    }
}
