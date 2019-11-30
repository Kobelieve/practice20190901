package com.kobe.practice.leetcode.me136;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: Solution2
 * @Description: TODO
 * @Author: Tao
 * @Date 2019-11-30 09:46
 */
public class Solution2 {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        System.out.println(solution.singleNumber(new int[]{3,3,2,2,1}));
    }

    public int singleNumber(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            Integer count = map.get(num);
            count = count == null ? 1 : ++count;
            map.put(num, count);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return -1;
    }
}
