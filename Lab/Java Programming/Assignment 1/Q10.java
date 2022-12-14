public class Q10 {
    public static int toBase(int num, int base1, int base2){
        String resultString = "";
        int resultInt = 0, count = 0;
        if(base1 == base2)
            return num;
        if(base1 < 1 || base2 < 1)
            return -1;
        if(base1 > base2){
            while(num != 0){
                resultString += num % base2;
                num /= base2;
            }
            return Integer.parseInt(resultString);
        } else {
            System.out.println("This is the num: " + num);
            while(num != 0){
                int lastDigit = num % 10;
                System.out.println(lastDigit);
                resultInt += (Math.pow(base2, count) * lastDigit);
                System.out.println("res" + resultInt);
                num /= 10;
                ++count;
            }
            return resultInt;
        }
    }
    public static void main(String[] args) {
        System.out.println(toBase(242, 3, 10));
    }
}

