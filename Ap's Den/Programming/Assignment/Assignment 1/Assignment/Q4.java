import java.util.*;
public class Q4 {

    public static int multiply(int num1, int num2){
        int result = 0;
        while(num2 != 0){
            if((num2 & 1) == 1)
                result += num1;
            num1 = num1 << 1;
            num2 = num2 >> 1;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 and number 2 to multiply: " );
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("The result of "+num1+"x"+num2+" is: " + multiply(num1, num2));
        sc.close();
    }
}
