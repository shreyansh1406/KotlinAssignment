package com.example.assessment

import java.util.*

fun main()
{
    var input = Scanner(System.`in`)
    println("Enter the nth number")
    var n = input.nextInt()
    var c=0
    for(i in 1.. n) {
        for (j in 1..i) {
            if (i%j==0)
                c++
        }
        if(c==2)
            println(i)
        c=0
    }

}
