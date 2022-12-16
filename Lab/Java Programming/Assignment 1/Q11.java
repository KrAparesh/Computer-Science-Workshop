import java.util.*;
public class Q11 {
    public static String reverseWords(String inputStr){
        inputStr += " ";
        String resultString = ""; String currWord = "";
        for(int i = 0; i < inputStr.length(); i++){
            if(inputStr.charAt(i) == ' '){       
                StringBuffer toReverseStr = new StringBuffer(currWord);
                currWord = toReverseStr.reverse().toString();
                resultString += currWord + " ";
                currWord = "";
            } 
            currWord += inputStr.charAt(i);
        }
        return resultString;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence to get it's words reversed: ");
        String inp = sc.nextLine();
        System.out.println("The resulting string is: " + reverseWords(inp));
        sc.close();
    }
}