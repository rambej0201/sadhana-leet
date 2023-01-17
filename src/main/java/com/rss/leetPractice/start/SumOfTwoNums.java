package com.rss.leetPractice.start;

import java.util.Arrays;
import java.util.HashMap;

public class SumOfTwoNums {
    public static void main(String[] args) {
        int[] someSampleArray = {2,6,9,23,46};

        System.out.println(Arrays.toString(twoSum(someSampleArray, 8)));
    }

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hashOne = new HashMap<>();

        for (int i =0; i <= nums.length; i++){

            int need_num = target-nums[i];

            if (hashOne.containsKey(need_num)){
                int [] arrValue = {hashOne.get(need_num), i};
                return arrValue;
            } hashOne.put(nums[i], i);

        }

        return null;
    }
}
