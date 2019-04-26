public class PalindromeNumber {
    public static void main(String[] args) {
        int firstNumber= -121;
        int secondNumber = 454;
        int thirdNumber = 120;

        if(isPalindrome(firstNumber)) {
            System.out.println(firstNumber + " is palindrome");
        }

        if(isPalindrome(secondNumber)) {
            System.out.println(secondNumber + " is palindrome");
        }

        if(isPalindrome(thirdNumber)) {
            System.out.println(thirdNumber + " is palindrome");
        }


    }

    public static boolean isPalindrome(int x) {
        if (x<0 || (x!=0 && x%10==0)) return false;
        int rev = 0;
        int original= x;
        while (x!=0){
            rev = rev*10 + x%10;
            x = x/10;
        }

        return (original==rev);
    }
}
