package Leetcode.Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSumLeetcode {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complementsIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (complementsIndex.containsKey(complement)) {
                return new int[]{complementsIndex.get(complement), i};
            }
            complementsIndex.put(nums[i], i);
        }
        throw new IllegalArgumentException("No match found!");
    }
}
/*
e.g.
{5,2,4} target = 6
HashMap
K ->  V
1 - > 0 (1 is the complement of 5 to reach the target of 6 and 0 is the index of number 5)
4 -> 1 (4 is the complement of 2 to reach the target of 6 and 1 is the index of number 2)
return {2,1}
*/