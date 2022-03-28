// Q4) Check if the string is palindrome or not
// Hamjak
// 28/3/22

public class PalindromeString {
    static boolean isPalindrome(String inputStr){
        String reverseStr = "";
        int inputStrLength = inputStr.length();
        for(int i = (inputStrLength-1); i>=0; i--)
            reverseStr = reverseStr + inputStr.charAt(i);
        if(inputStr.toLowerCase().equals(reverseStr.toLowerCase()))
            return true;
        return false;
    }
    static void test(){
        String [] tests = {"radar", "level", "lol", "java", "ja"};
        for(int t=0; t < tests.length; t++){
            if(isPalindrome(tests[t]))
                System.out.println(tests[t]+ " is palindrome ");
        }
    }
    public static void main(String[] args) {
        test();
    }
}
