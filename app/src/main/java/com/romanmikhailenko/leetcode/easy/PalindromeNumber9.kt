package com.romanmikhailenko.leetcode.easy

class PalindromeNumber9 {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) {
            return false
        }
        var y = x
        var res = 0;
        while (y != 0) {
            res = 10*res + y%10
            y /= 10
        }
        return x == res
    }
}