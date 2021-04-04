package com.example.assessment

import java.util.*

fun LeapYear(y: Int): Boolean {
    return ((y % 400) == 0)
            || (((y % 4) == 0) && ((y % 100) != 0))
}
fun main() {

    val r = Scanner(System.`in`)

    println("Enter Year:")
    val y = r.nextInt()

    val m = if(LeapYear(y)) {
        "Given year is a leap year."
    } else {
        "Given year is not a leap year."
    }

    println(m)
}


