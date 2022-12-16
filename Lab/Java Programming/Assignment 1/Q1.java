import java.util.*;
public class Q1 {
    public static int getBitCount(int num){
        int count = 0;
        while(num != 0){
            count++;
            num >>= 1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to get it's bit count: ");
        int input = sc.nextInt();
        System.out.println("The number " + input + " has " + getBitCount(input) + " number of bits.");
        sc.close();
    }
}