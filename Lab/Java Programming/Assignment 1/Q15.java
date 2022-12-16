public class Q15 {
    public static int getPrimeCount(int[] numArray){
        int count = 0;
        for(int num: numArray){
            if(isPrime(num))
                count++;
        }
        return count;
    }   

    public static boolean isPrime(int num) {
        for(int i = 2 ; i < num / 2 ; i++) {
            if(num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int num[] = {5,2,11,13,19,17,23, 12, 4};
        System.out.println("The number of prime elements are: " + getPrimeCount(num));

    }
}
