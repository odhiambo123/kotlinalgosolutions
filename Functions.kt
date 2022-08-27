package com.davidodhiambo.kotlinalgosolutions

class Functions {
fun twoSum(nums:IntArray, target:Int):IntArray {
    val map = mutableMapOf<Int, Int>()
    for (i in nums.indices) {
        val diff = target - nums[i]
        if (map.containsKey(diff)) {
            print(intArrayOf(map[diff]!!, i).toString())
        }
        map[nums[i]] = i
    }
    return intArrayOf(-1, -1)
}

    //Given a string implement a function which returns true if string contains at least one repeated character, otherwise it returns false.

    fun isUnique(str: String): Boolean {
        val set = mutableSetOf<Char>()
        for (i in str.indices) {
            if (set.contains(str[i])) {
                return false
            }
            set.add(str[i].lowercaseChar())
        }
        return true
    }
}
