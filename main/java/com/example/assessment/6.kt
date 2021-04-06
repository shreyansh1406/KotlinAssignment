package com.example.assessment

import java.util.*

fun main()
{
    val sc = Scanner(System.`in`)
    println("Enter the Size of Array: ")
    val n = sc.nextInt()
    var arr = Array(n){0}
    for (i in 0..n-1)
    {
        println("Enter the next element")
        var b: Int = sc.nextInt()
        arr[i]=b
    }

    var great =  arr[0]
    var l : (Int) -> Unit = { l: Int ->
        for (i in 1..n - 1) {
            if (arr[i] > great)
            {
                great= arr[i]
            }
        }
    }
    l(arr[0])
    println("Largest number in array is $great")
    var smaller =  arr[0]
    var lamb : (Int) -> Unit = { s: Int ->
        for (i in 1..n - 1) {
            if (arr[i] < smaller)
            {
                smaller = arr[i]
            }
        }
    }
    lamb(arr[0])
    println("Smallest number in array is $smaller")
}
