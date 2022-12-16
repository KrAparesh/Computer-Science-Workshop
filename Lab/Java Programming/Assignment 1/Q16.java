public class Q16 {
    public static void rotateArray(int[] numArray){
        for(int i = 0, j = numArray.length - 1; i <= j; i++, j--){
            int temp = numArray[i];
            numArray[i] = numArray[j];
            numArray[j] = temp;
        }
        for(int num: numArray){
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] numArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        rotateArray(numArray);
    }
}
