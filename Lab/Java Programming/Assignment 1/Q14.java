import java.util.*;
public class Q14 {
    
    public static ArrayList<Integer> checkedList = new ArrayList<Integer>();
   
    public static String getFrequency(int[] numArray) {
        for(int i = 0 ; i < numArray.length; i++){
            int count = 0;
            if(checkedList.contains(numArray[i])) {
                continue;
            }
            System.out.print("Frequency of " + numArray[i] + ": ");
            checkedList.add(numArray[i]);
            for(int j = 0 ; j < numArray.length; j++){
                if(numArray[i] == numArray[j]){
                    count++;
                }
            }
            System.out.println(count);
        }
        return null;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,1,1,5,3,5,4};
        getFrequency(arr);
    }
}
