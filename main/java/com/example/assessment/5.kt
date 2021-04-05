package com.example.assessment

import java.util.*

fun main(args: Array<String>){
    val sc = Scanner(System.`in`)

    print("Enter the nth Number : ")
    val n: Int = sc.nextInt()
    val Lambda: (Int) -> Unit= {s: Int -> println(s) }
    fact(n,Lambda)
}
fun fact(a: Int, lambda: (Int) -> Unit ){
    var n=1
    for(i in 1..a){n=n*i}
    lambda(n)
}
