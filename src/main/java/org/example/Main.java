package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(4, 1, 6 , 2, 3));
        int higher = 0;

        System.out.println(solution.findHigher(nums, higher, 0));
    }
}


class Solution {

    public int findHigher(ArrayList<Integer> nums, int higher, int removed) {

            if (nums.size() == 1) {
                return nums.get(0);
            } else {
                removed = nums.remove(nums.size() - 1);
                higher = findHigher(nums, higher, removed);
                if (removed >higher) {
                    return removed;
                } else  {
                    return higher;
                }
            }


    }
}