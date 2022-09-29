package string;

/*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and
 removing all non-alphanumeric characters, it reads the same forward and backward.
  Alphanumeric characters include letters and numbers.
  Given a string s, return true if it is a palindrome, or false otherwise.

  Example 1:
  Input: s = "A man, a plan, a canal: Panama"
  Output: true
  Explanation: "amanaplanacanalpanama" is a palindrome.

  Example 2:
  Input: s = "race a car"
  Output: false
  Explanation: "raceacar" is not a palindrome.

 Example 3:
 Input: s = " "
 Output: true
 Explanation: s is an empty string "" after removing non-alphanumeric characters.
  Since an empty string reads the same forward and backward, it is a palindrome.*/
public class StringPallindrome {
    public boolean pallindromeCheck(String s) {
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        s = s.replaceAll("\\s", "");
        int length = s.length();
        System.out.println("String after removing space and non alphanumeric------ " + s);
        //System.out.println("Length of string is -----" + s.length());
        if (s.length() == 0) {
            return true;
        }
        try {
            for (int i = 0; i < s.length(); i++) {
                if (i == 0) {
                    length = length - 1;
                }
                if (s.charAt(i) != s.charAt(length)) {
                    break;
                }
                if(length == i){
                    return true;
                }
                length = length - 1;
            }
            return false;
        }catch (StringIndexOutOfBoundsException e) {
            System.out.println("String index out of bound");
        }
        return false;
    }
    public static void main(String[] args){
        String s1 = "A man; a plan; a ; canal: Panama";
        String s2 = "race a car";
        String s3 = "abcba";
        String s4 = "";
        StringPallindrome stringPallindrome = new StringPallindrome();
        System.out.println("String 1 is pallindrome or not result is " + stringPallindrome.pallindromeCheck(s1));
        System.out.println("String 2 is pallindrome or not result is " + stringPallindrome.pallindromeCheck(s2));
        System.out.println("String 3 is pallindrome or not result is " + stringPallindrome.pallindromeCheck(s3));
        System.out.println("String 4 is pallindrome or not result is " + stringPallindrome.pallindromeCheck(s4));
    }
}
