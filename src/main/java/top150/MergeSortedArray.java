package top150;

public class MergeSortedArray {
    /*
        Link to the problem: https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
    */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Merge nums2 into nums1 starting from position m
        for(int i = 0; i < n; i++){
            nums1[m + i] = nums2[i]; // Add each element from nums2 to nums1 at the end of the initialized section
        }

        // Sort the combined array using quicksort
        quicksort(nums1, 0, nums1.length - 1); // Full array sort (nums1 now contains both original and merged elements)
    }
    private void quicksort(int[] nums, int start, int end) {
        // Base case: if the start index is greater than or equal to the end, return
        if (end <= start) return;

        // Partition the array and get the pivot index
        int pivot = partition(nums, start, end);

        // Recursively sort the left and right subarrays
        quicksort(nums, start, pivot - 1); // Sort the left side of the pivot
        quicksort(nums, pivot + 1, end);   // Sort the right side of the pivot
    }

    private int partition(int[] nums, int start, int end) {
        // Use the last element as the pivot
        int pivot = nums[end];
        int i = start - 1; // Pointer for greater elements (initially out of bounds)

        // Iterate through the array from start to end-1
        for (int j = start; j < end; j++) {
            // If the current element is smaller than the pivot, swap it with the element at i+1
            if (nums[j] < pivot) {
                i++; // Move i to the right
                // Swap nums[i] and nums[j]
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        // Finally, place the pivot in its correct position (i+1)
        i++;
        int temp = nums[i];
        nums[i] = nums[end];
        nums[end] = temp;

        // Return the index of the pivot
        return i;
    }
}
