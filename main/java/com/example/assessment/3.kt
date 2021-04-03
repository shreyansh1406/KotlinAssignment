package com.example.assessment

import java.util.*

fun main()
{
    val c = Scanner(System.`in`)
    println("Enter the marks of first subject")
    var s1=c.nextFloat()
    println("Enter the marks of second subject")
    var s2=c.nextFloat()
    println("Enter the marks of third subject")
    var s3=c.nextFloat()
    var t=s1+s2+s3
    println("The total is $t ")
    var p=t/3
    println("The percentage of the student is $p ")



}