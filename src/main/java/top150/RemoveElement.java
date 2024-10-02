package top150;

public class RemoveElement {
    /*
        Link to the problem: https://leetcode.com/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150
    */
    public int removeElement(int[] array, int val) {
        int count = 0; // Counter for elements that are not equal to 'val'

        for (int i = 0; i < array.length; i++) {
            int temp = array[i]; // Store current element in a temporary variable
            if (temp != val) { // Check if current element is not equal to 'val'
                array[count] = temp; // Move the valid element to the 'count' index
                count++; // Increment count for valid elements
            }
        }
        return count; // Return the count of valid elements
    }

}
