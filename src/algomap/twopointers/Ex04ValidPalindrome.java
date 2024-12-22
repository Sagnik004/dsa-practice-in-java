package algomap.twopointers;

// https://leetcode.com/problems/valid-palindrome/description/
public class Ex04ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome_approach1("A man, a plan, a canal: Panama") ? "Palindrome" : "Not Palindrome");
        System.out.println(isPalindrome_approach2("A man, a plan, a canal: Panama") ? "Palindrome" : "Not Palindrome");
        System.out.println(isPalindrome_approach1("race a car") ? "Palindrome" : "Not Palindrome");
        System.out.println(isPalindrome_approach2("race a car") ? "Palindrome" : "Not Palindrome");
        System.out.println(isPalindrome_approach1(" ") ? "Palindrome" : "Not Palindrome");
        System.out.println(isPalindrome_approach2(" ") ? "Palindrome" : "Not Palindrome");
    }

    // TC = O(n), SC = O(n)
    public static boolean isPalindrome_approach1(String s) {
        String formattedStr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0, right = formattedStr.length() - 1;

        while (left < right) {
            if (formattedStr.charAt(left) != formattedStr.charAt(right))
                return false;
            left++;
            right--;
        }

        return true;
    }

    // TC = O(n), SC = O(n)
    public static boolean isPalindrome_approach2(String s) {
        StringBuilder sb = new StringBuilder();
        String formattedStr = "";

        for (int i = 0; i < s.length(); i++) {
            boolean isAlphabetic = Character.isAlphabetic(s.charAt(i));
            boolean isDigit = Character.isDigit(s.charAt(i));

            if (isAlphabetic || isDigit) {
                sb.append(s.charAt(i));
            }
        }
        formattedStr = sb.toString().toLowerCase();

        int left = 0, right = formattedStr.length() - 1;
        while (left < right) {
            if (formattedStr.charAt(left) != formattedStr.charAt(right))
                return false;
            left++;
            right--;
        }

        return true;
    }
}
