package com.davidodhiambo.kotlinalgosolutions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val functions = Functions()
        val nums = intArrayOf(2,7,11,15)
        val target = 9
        val result = functions.twoSum(nums, target)
        println(result)
    }
}