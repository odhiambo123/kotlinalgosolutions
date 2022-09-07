package com.davidodhiambo.kotlinalgosolutions

import java.util.*


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
fun rangeContainsRange(range1: IntRange, range2: IntRange): Boolean {
    return range1.first <= range2.first && range1.last >= range2.last
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

/** print
#
##
###
####
#####
######
######
#####
####
###
##
#
 */

fun printStaircase(n:Int){
    for (i in 1..n){
        for (j in 1..i){
            print("#")
        }
        println()
    }
    for (i in n-1 downTo 1){
        for (j in 1..i){
            print("#")
        }
        println()
    }
}

fun printStaircase2(n: Int){
    val  a : String = "#"
    for(i in 1..n){
        println(a.repeat(i))

    }
    for (j in n downTo 1){
        println(a.repeat(j))

    }
}

//pascal triangle
fun pascalTriangle(n: Int){
    for (i in 0 until n){
        for (j in 0..i){
            print("${factorial(i) / (factorial(j) * factorial(i - j))} ")
        }
        println()
    }
}

fun factorial(i: Int): Int {
    var result = 1
    for (j in 1..i){
        result *= j
    }
    return result
}

//map
fun map(){
    val map = mutableMapOf<String, Int>()
    map["a"] = 1
    map["b"] = 2
    map["c"] = 3
    map["d"] = 4
    map["e"] = 5
    map["f"] = 6
    map["g"] = 7
    map["h"] = 8
    map["i"] = 9
    map["j"] = 10
    map["k"] = 11
    map["l"] = 12
    map["m"] = 13
    map["n"] = 14
    map["o"] = 15
    map["p"] = 16
    map["q"] = 17
    map["r"] = 18
    map["s"] = 19
    map["t"] = 20
    map["u"] = 21
    map["v"] = 22
    map["w"] = 23
    map["x"] = 24
    map["y"] = 25
    map["z"] = 26
    print(map)//{a=1, b=2, c=3, d=4, e=5, f=6, g=7, h=8, i=9, j=10, k=11, l=12, m=13, n=14, o=15, p=16, q=17, r=18, s=19, t=20, u=21, v=22, w=23, x=24, y=25, z=26}
}

//list
fun list(){
    val list = mutableListOf<Int>()
    list.add(1)
    list.add(2)
    list.add(3)
    list.add(4)
    list.add(5)
    list.add(6)
    list.add(7)
    list.add(8)
    list.add(9)
    list.add(10)
    list.add(11)
    list.add(12)
    list.add(13)
    list.add(14)
    list.add(15)
    list.add(16)
    list.add(17)
    list.add(18)
    list.add(19)
    list.add(20)
    list.add(21)
    list.add(22)
    list.add(23)
    list.add(24)
    list.add(25)
    list.add(26)
    print(list)//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26]
}

//set
fun set(){
    val set = mutableSetOf<Int>()
    set.add(1)
    set.add(2)
    set.add(3)
    set.add(4)
    set.add(5)
    set.add(6)
    set.add(7)
    set.add(8)
    set.add(9)
    set.add(10)
    set.add(11)
    set.add(12)
    set.add(13)
    set.add(14)
    set.add(15)
    set.add(16)
    set.add(17)
    set.add(18)
    set.add(19)
    set.add(20)
    set.add(21)
    set.add(22)
    set.add(23)
    set.add(24)
    set.add(25)
    set.add(26)
    print(set)//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26]
}

//filter
fun filter(){
    val list = mutableListOf<Int>()
    list.add(1)
    list.add(2)
    list.add(3)
    list.add(4)
    list.add(5)
    list.add(6)
    list.add(7)
    list.add(8)
    list.add(9)
    list.add(10)
    list.add(11)
    list.add(12)
    list.add(13)
    list.add(14)
    list.add(15)
    list.add(16)
    list.add(17)
    list.add(18)
    list.add(19)
    list.add(20)
    list.add(21)
    list.add(22)
    list.add(23)
    list.add(24)
    list.add(25)
    list.add(26)
    val result = list.filter { it % 2 == 0 }
    print(result)//[2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26]
}
//filterNot
fun filterNot(){
    val list = mutableListOf<Int>()
    list.add(1)
    list.add(2)
    list.add(3)
    list.add(4)
    list.add(5)
    list.add(6)
    list.add(7)
    list.add(8)
    list.add(9)
    list.add(10)
    list.add(11)
    list.add(12)
    list.add(13)
    list.add(14)
    list.add(15)
    list.add(16)
    list.add(17)
    list.add(18)
    list.add(19)
    list.add(20)
    list.add(21)
    list.add(22)
    list.add(23)
    list.add(24)
    list.add(25)
    list.add(26)
    val result = list.filterNot { it % 2 == 0 }
    print(result)//[1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25]
}

//filter positives

//map
val numbers = listOf(1, -2, 3, -4, 5, -6)     // 1

val doubled = numbers.map { x -> x * 2 }      // 2

val tripled = numbers.map { it * 3 }          // 3


//count the occurences of each letter in a string
fun countLetters(){
    val string = "Hello World"
    val map = mutableMapOf<Char, Int>()
    string.forEach {
        if(map.containsKey(it)){
            map[it] = map[it]!! + 1
        }else{
            map[it] = 1
        }
    }
    print(map)//{H=1, e=1, l=3, o=2,  =1, W=1, r=1, d=1}
}

//list the index of each letter in a string
fun listIndex(){
    val string = "Hello World"
    val map = mutableMapOf<Char, MutableList<Int>>()
    string.forEachIndexed { index, c ->
        if(map.containsKey(c)){
            map[c]!!.add(index)
        }else{
            map[c] = mutableListOf(index)
        }
    }
    print(map)//{H=[0], e=[1], l=[2, 3, 9], o=[4, 8],  =[5], W=[6], r=[7], d=[10]}
}
