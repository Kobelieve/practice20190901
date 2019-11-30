package com.kobe.practice.leetcode.me136;

/**
 * @ClassName: Solution
 * @Description: 只出现一次的数字
 * <p>
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * <p>
 * 说明：
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * @Author: Tao
 * @Date 2019-11-30 09:20
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.singleNumber(new int[]{3,3,2,2,1}));
    }

    public int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            boolean flag = false;
            for (int j = 0; j < nums.length; j++) {
                if (j == i) {
                    continue;
                }
                if (temp == nums[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                return nums[i];
            }
        }
        return -1;
    }
}
