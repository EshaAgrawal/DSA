package array;

import java.util.Scanner;

/** Given an array of integers nums and an integer target,
* return indices of the two numbers such that they add up to target
**/
public class IndicesOfTwoNumbersAddToTarget {
    public int[] Sum(int nums[], int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = (i + 1); j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("indices of element that sum to target is" + "[" + i
                            + "," + j + "]");
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = scanner.nextInt();
        int nums[] = new int[size];
        System.out.println("Enter elements of array");
        for (i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println("Enter target sum");
        int target = scanner.nextInt();
        IndicesOfTwoNumbersAddToTarget t = new IndicesOfTwoNumbersAddToTarget();
        int[] output = t.Sum(nums, target);
        for (i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }
}