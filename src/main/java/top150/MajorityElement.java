package top150;

import java.util.Arrays;

public class MajorityElement {
    /*
        Link to a problem: https://leetcode.com/problems/majority-element/?envType=study-plan-v2&envId=top-interview-150
    */

    public int majorityElement(int[] array){
        //Since the majority element has to be present in an array, by sorting the list, we guarantee that the element we are looking for will be exactly in the middle of the array
        Arrays.sort(array);
        return array[array.length/2];
    }
    public int majElement(int[] array){
        /*
        This code uses the Boyer-Moore Voting Algorithm to find the majority element by tracking a candidate and adjusting its count.
        If the count reaches zero, the candidate is updated. The final candidate is returned as the majority element.
        */
        int count = 0;
        int candidate = 0;

        for(int num:array){
            if(count == 0){
                candidate = num;
            }
            count += (candidate == num)? 1:-1;
        }
        return candidate;
    }
}
