package leetcode.leetcode75.A01ArrayString;

// https://leetcode.com/problems/reverse-vowels-of-a-string/description
public class AS05ReverseVowelsofaString {

    // TC = O(n) where n = length of string or count of chars, SC = O(1)
    public String reverseVowels(String s) {
        char[] charArr = s.toCharArray();
        int l = 0, r = charArr.length - 1;

        while (l < r) {
            // Move left pointer until vowel is found
            while (l < r && !isVowel(charArr[l])) {
                l++;
            }

            // Move right pointer until vowel is found
            while (l < r && !isVowel(charArr[r])) {
                r--;
            }

            // Swap the vowels
            if (l < r) {
                char temp = charArr[l];
                charArr[l] = charArr[r];
                charArr[r] = temp;
                l++;
                r--;
            }
        }

        return new String(charArr);
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    public static void main(String[] args) {
        AS05ReverseVowelsofaString thisClass = new AS05ReverseVowelsofaString();
        System.out.println(thisClass.reverseVowels("IceCreAm"));
        System.out.println(thisClass.reverseVowels("leetcode"));
    }
}
