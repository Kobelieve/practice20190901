package com.kobe.practice.leetcode.me136;

/**
 * @ClassName: Solution3
 * @Description: TODO
 * @Author: Tao
 * @Date 2019-11-30 10:03
 */
public class Solution3 {

    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        System.out.println(solution.singleNumber(new int[]{3,2,2,3,1}));
    }

    /**
     * @Author Tao
     * @Description
     *          异或^:相同为0，不同为1
     *          按位与&:都为1，才可以为1
     *          按位或：有一个为1，即为1
     * @Date 2019-11-30 10:15
     * @Param [nums]
     * @return int
     */
    public int singleNumber(int[] nums) {

        int num = nums[0];
        for (int i = 1; i < nums.length; i++) {
            num = num ^ nums[i];
        }

        return num;
    }

}
