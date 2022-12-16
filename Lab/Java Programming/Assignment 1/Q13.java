import java.util.*;
public class Q13 {
    
    public static ArrayList<String> checkedList = new ArrayList<String>();
   
    public static String getFrequency(String num) {
        String numArray[] = (num + "").split("");
        for(int i = 0 ; i < numArray.length; i++){
            int count = 0;
            if(checkedList.contains(numArray[i])) {
                continue;
            }
            System.out.print("Frequency of " + numArray[i] + ": ");
            checkedList.add(numArray[i]);
            for(int j = 0 ; j < numArray.length; j++){
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
