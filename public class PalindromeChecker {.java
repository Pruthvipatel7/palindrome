public class PalindromeChecker {

    public static boolean isPalindrome(String s) {
    
        s = s.replaceAll("\\s+", "").toLowerCase();

    
        String reversed = new StringBuilder(s).reverse().toString();

        return s.equals(reversed);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));     
        System.out.println(isPalindrome("hello"));     
        System.out.println(isPalindrome("race car"));  
    }
}