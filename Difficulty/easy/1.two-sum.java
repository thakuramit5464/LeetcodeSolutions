package Difficulty.easy;
/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

import java.util.HashMap;
import java.util.Map;

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i);
        }
        return result;
    }
}
// @lc code=end

