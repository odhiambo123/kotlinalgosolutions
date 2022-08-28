package com.davidodhiambo.kotlinalgosolutions

class Functions {
    //Given an array of integers, return indices of the two numbers such that they add up to a specific target.
    //You may assume that each input would have exactly one solution, and you may not use the same element twice.
}
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

    //Given a string implement a function which returns true if string contains at least one repeated character,
    // otherwise it returns false.
    //https://gist.github.com/64b49f16375c377229e09f89f1ba6185
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

    //capitalize a sentence
    fun capitalize(str : String){

        val allCaps =str.split(" ,")
        for (o in allCaps){
            print(o.uppercase())
        }
    }

    //Given a string, return a new string with the reversed order of characters
    fun reverse(str: String): String {
        val reversed = StringBuilder()
        for (i in str.length - 1 downTo 0) {
            reversed.append(str[i])
        }
        val result = reversed.toString()
        //print(result)
        return result
    }

    //Given an array of integers, return an array where each element
    // is the product of all the numbers in the original array except the one at that index.
    fun productExceptSelf(nums: IntArray): IntArray {
        val result = IntArray(nums.size)
        var product = 1
        for (i in nums.indices) {
            result[i] = product
            product *= nums[i]
        }
        product = 1
        for (i in nums.size - 1 downTo 0) {
            result[i] *= product
            product *= nums[i]
        }
        return result
    }

    //Given a string, return true if the string is a palindrome or false if it is not.
    //Palindrome strings are those that read the same forward and backward.
    fun isPalindrome(str: String): Boolean {
        val reversed = StringBuilder()
        for (i in str.length - 1 downTo 0) {
            reversed.append(str[i])
        }
        val result = reversed.toString()
        return result == str
    }

    //Given an array of integers, return the maximum sum for a non-empty subarray(contiguous elements)
    // within the array.
    fun maxSubArray(nums: IntArray): Int {
        var max = nums[0]
        var sum = 0
        for (i in nums.indices) {
            sum += nums[i]
            if (sum > max) {
                max = sum
            }
            if (sum < 0) {
                sum = 0
            }
        }
        return max
    }

    //Given a string, find the length of the longest substring without repeating characters.
    fun lengthOfLongestSubstring(s: String): Int {
        var max = 0
        var start = 0
        val map = mutableMapOf<Char, Int>()
        for (i in s.indices) {
            if (map.containsKey(s[i])) {
                start = Math.max(start, map[s[i]]!! + 1)
            }
            map[s[i]] = i
            max = Math.max(max, i - start + 1)
        }
        return max
    }

    //Given a string, find the first non-repeating character in it and return it's index.
    // If it doesn't exist, return -1.
    fun firstUniqChar(s: String): Int {
        val map = mutableMapOf<Char, Int>()
        for (i in s.indices) {
            map[s[i]] = map.getOrDefault(s[i], 0) + 1
        }
        for (i in s.indices) {
            if (map[s[i]] == 1) {
                return i
            }
        }
        return -1
    }

//get odd numbers
fun getOddNumbers(){
    for (i in 1..100){
        if (i%2!=0){
            print(i)
        }
    }
}

//range containes range
fun rangeContainsRange(){
    val range1 = 1..10
    val range2 = 5..15
    println(range1.contains(range2))
}

//add up to
// Time Complexity: O(1)
// Mathematical formula
fun addTo(n: Int): Int {
    val result  = n * (n + 1) / 2
    print(result)
    return result
}

//count down and return a list
fun countDown(n:Int): List<Int>{
    val result = (n downTo 0).toList()
    print(result)
    return result
}


