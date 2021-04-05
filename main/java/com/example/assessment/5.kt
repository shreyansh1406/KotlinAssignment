package com.example.assessment

import java.util.*

fun main()
{
    val factorial : (Int) -> Unit = { number ->
        var f : Int = 1
        for(i in 1..number)
        {
            f *= i
        }
        println(f)
    }
    val sc = Scanner(System.`in`)

    print("Enter the nth Number : ")
    val n: Int = sc.nextInt()
    factorial(n)
}
