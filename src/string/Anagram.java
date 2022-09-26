package string;

import java.util.Arrays;


/*      Given two strings s and t, return true if t is an anagram of s, and false otherwise.
        An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
        Example 1:
        Input: s = "anagram", t = "nagaram"
        Output: true
        Example 2:
        Input: s = "rat", t = "car"
        Output: false*/
public class Anagram {
    public boolean anagramOrNot(String s, String t) {
        char[] string1 = s.toLowerCase().toCharArray();
        char[] string2 = t.toLowerCase().toCharArray();
        Arrays.sort(string1);
        Arrays.sort(string2);
        if (Arrays.equals(string1, string2)) {
            return true;
        }
        return false;
    }
        /*s = s.toLowerCase();
        t = t.toLowerCase();
        if(s.length() == t.length()){
            for(int i = 0; i< s.length(); i++){
                for(int j = 0; j< t.length() ; j++){
                    System.out.println("(i,j) " + i + ", "+ j);
                    if(s.charAt(i) == t.charAt(j)) {
                        System.out.println("s char at " + i + "t char at " + j);
                        break;
                    }

                }
            }
            System.out.println("<-------Annagram------->");
            return true;
        }
        System.out.println("<-----Not  Annagram------>");
            return false;
    }*/

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        Anagram anagram = new Anagram();
        Boolean result = anagram.anagramOrNot(s, t);
        System.out.println("Result is " + result);
    }
}
