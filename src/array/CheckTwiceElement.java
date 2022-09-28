package array;
/*Given an integer array nums, return true if any value appears at least twice in the array,
and return false if every element is distinct.
Example 1:
Input: nums = [1,2,3,1]
Output: true
Example 2:
Input: nums = [1,2,3,4]
Output: false
Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true*/

public class CheckTwiceElement {
    public boolean checkOccurence(int Array[]){
       // int count = 0;
        for (int i = 0; i <(Array.length-1); i++){
            if(Array[i] == Array[i+1]) {
                System.out.println("Element " + Array[i] + " occurs more than once");
                return true;
            }
        }
        System.out.println("Distint elements");
        return false;
    }
    public static void main(String[] args){
        int A[] = {1,2,3,4,4,5};
        System.out.println("length is"+ (A.length-1));
        CheckTwiceElement c = new CheckTwiceElement();
        boolean result = c.checkOccurence(A);
        System.out.println("Result is " + result);
    }
}
