import java.util.*;
public class Q12 {
    public static String getFrequency(String num) {
        String numArray[] = (num + "").split("");
        for(int i = 0 ; i < numArray.length; i++){
            int count = 0;
            System.out.print("Frequency of " + numArray[i] + ": ");
            for(int j = i+1 ; j < numArray.length; j++){
                if(numArray[i].equals(numArray[j])){
                    count++;
                }
            }
            System.out.println(count);
        }
        return null;
    }
    
    public static void main(String[] args) {
        getFrequency("1234115354");
    }
}
