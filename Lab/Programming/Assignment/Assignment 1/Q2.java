import java.util.*;
class Q2 {
    public static int getTParity(String num){
        if(num.charAt(0) == '-')
            num = num.substring(1, num.length());
        int count = 0;
        while(num.length() != 0){
            int digit = Integer.parseInt(num.substring(num.length() - 1));
            num = num.substring(0, num.length() - 1);
            while(digit != 0){
                if((digit & 1) == 1)
                    count++;
                digit <<= 1;
            }
        }
        return ((count % 2 != 0) ? 1 : 0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to get it's parity bit: ");
        String inp = sc.next();
        System.out.println("The parity of " + inp + " is " + getTParity(inp));
        sc.close();
    }
}