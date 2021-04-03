package com.example.assessment
import java.util.Scanner
fun main()
{
    val r = Scanner(System.`in`)
    println("enter first number")
    var a=r.nextFloat()
    println("enter second number")
    var b=r.nextFloat()
    var c=a+b
    println("thier additon is =$c ")
    c=a-b
    println("thier subtraction is =$c ")
    c=a*b
    println("thier multipication is = $c ")
    c=a/b
    println("thier division is = $c ")

}