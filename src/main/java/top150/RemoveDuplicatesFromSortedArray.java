package top150;

public class RemoveDuplicatesFromSortedArray {
    /*
        Link to a problem: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
    */

    public int removeDuplicates(int[] array) {
        // If the array has 0 or 1 element, return the length as no duplicates are possible
        if (array.length <= 1) return array.length;

        int k = 1; // Initialize k to track the position of the next unique element

        // Loop starts from 1 since the first element is always considered unique
        for (int i = 1; i < array.length; i++) {
            // If the current element is not equal to the previous element, it's unique
            if (array[i] != array[i - 1]) {
                array[k] = array[i]; // Place the unique element in the next position
                k++; // Increment k to prepare for the next unique element
            }
        }
        // Return the count of unique elements in the array
        return k;
    }

    /*
        Link to the problem #2: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/?envType=study-plan-v2&envId=top-interview-150
    */
    public int removeDuplicate(int[] array){
        //The logic of this problem is exactly the same as with the previous one, except that we ignore the first duplicate instance of each number
        if(array.length<=2) return array.length;
        int k = 2;
        for(int i = 2; i < array.length; i++){
            if(array[i] != array[k-2]){
                array[k] = array[i];
                k++;
            }
        }
        return k;
    }

}
