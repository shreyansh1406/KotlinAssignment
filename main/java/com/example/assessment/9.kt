package com.example.assessment
import java.util.*

fun Palindrome(n: Long): Boolean {
    var isPalindrome = false
    var sum : Long= 0
    var temp= n

    while (temp > 0) {
        val r = temp % 10
        sum = sum * 10 + r
        temp /= 10
    }
    if (sum == n) {
        isPalindrome = true
    }
    return isPalindrome
}

fun main(arg: Array<String>) {

    val sc = Scanner(System.`in`)

    print("Enter the nth Number : ")
    val n: Long = sc.nextLong()

    val list: MutableList<Long> = ArrayList()


    for (i in 1..n) {
        if (Palindrome(i)) {
            list.add(i)
        }
    }

    println("Palindrome Numbers are : $list")
}

