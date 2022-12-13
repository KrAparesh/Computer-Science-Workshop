import java.util.*;
public class Q3 {
    public static ArrayList<String> swapBit(int num, int bit1, int bit2){
        ArrayList<String> myList = new ArrayList<String>();
        String newBinaryString = "";
        int bitCount = getBitCount(num); System.out.println(bitCount);
        if(bitCount < bit1 || bitCount < bit2){
            return null;
        }
        String binaryDigit = getBinaryEquivalent(num);
        char b1 = binaryDigit.charAt(bit1);
        char b2 = binaryDigit.charAt(bit2);
        myList.add(binaryDigit + "");
        if(b1 == b2){
            myList.add("0");
            return myList;
        } else {
            for(int i = 0; i < binaryDigit.length(); i++){
                if(i == Math.min(bit1, bit2)){
                    newBinaryString += Math.min(bit1, bit2) == bit1 ? b2 : b1;    
                    continue;
                }
                if(i == Math.max(bit1, bit2)){
                    newBinaryString += Math.max(bit1, bit2) == bit2 ? b1 : b2;    
                    continue;
                }
                newBinaryString += binaryDigit.charAt(i);
            }
        }
        myList.add(newBinaryString);
        return myList; 
    }
    public static int getBitCount(int num){
        int count = 0;
        while(num != 0){
            count++;
            num >>= 1;
        }
        return count;
    }
    public static String getBinaryEquivalent(int num){
        String beq = "";
        while(num != 0){
            beq += num % 2;
            num /= 2; 
        }
        return beq;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to swap it's bits, i'th bit, and j'th bit: ");
        int num = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();
        System.out.println("The binary equivalent of "+num+ " is " + swapBit(num, i, j).get(0) + " and after swapping is: " + ((swapBit(num, i, j).get(1) == "0") ? swapBit(num, i, j).get(0) : swapBit(num, i, j).get(1)));
        sc.close();
    }

}