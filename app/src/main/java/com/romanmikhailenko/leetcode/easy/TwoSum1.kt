package com.romanmikhailenko.leetcode.easy

class TwoSum1 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val result = IntArray(2)
        val map = HashMap<Int, Int>()
        for (i in nums.indices) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = map[target - nums[i]]!!
                return result
            }
            map[nums[i]] = i
        }
        return result
    }
}