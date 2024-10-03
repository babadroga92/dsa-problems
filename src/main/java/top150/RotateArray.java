package top150;

public class RotateArray {
    /*
        Link to the problem: https://leetcode.com/problems/rotate-array/description/?envType=study-plan-v2&envId=top-interview-150
    */

    /*
    In order to solve this problem we will:
        1.Create a helper method that will reverse the array in place
        2. Define a variable n and set it to be the length of an array
        3. Use modulo to get reduce the number of rotations we will have to do (ex. k = 10, nums.length=3 => update k = 1)
        4. Reverse the whole array
        5. Reverse left side of an array
        6. Reverse right side of an array (with middle index included)
    */
    public int[] rotate(int[] nums, int k){
        int n = nums.length;
        k = k%n;
        reverseInPlace(nums,0, n-1);
        reverseInPlace(nums,0, k-1);
        reverseInPlace(nums,k, n-1);
        return nums;
    }
    public void reverseInPlace(int[]num, int start, int end){
        while(start<=end){
            int temp = num[start];
            num[start]=num[end];
            num[end]=temp;
            start++;
            end--;
        }
    }
}
