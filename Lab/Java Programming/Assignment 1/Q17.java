public class Q17 {  
    public static void removeDuplicates(int[] numArray){
        int dupCount = 0;
        for(int i = 0, j = 0; i < numArray.length - 1; i++){
            if(numArray[i] == numArray[i + 1])
            dupCount++;
        }
        
        int dupArray[] = new int[numArray.length - dupCount];
        for(int i = 0, j = 0; i < numArray.length - 1; i++){
            if(!(numArray[i] == numArray[i + 1])){
                dupArray[j] = numArray[i];
                j++;
            }
        }

        for(int num: dupArray){
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int num[] = {1,1,1,2,2,3,5,6,7,7,8,9,9};
        removeDuplicates(num);
    }
}
