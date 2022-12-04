public class Q1 {
    public static int getBitCount(int num){
        int count = 0;
        while(num != 0){
            num >>= 1;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Total bits: "+getBitCount(183));
    }
}