package com.example.assessment
import java.util.Scanner
fun main()
{
    val c = Scanner(System.`in`)
    println("Enter the radius of circle")
    var r=c.nextFloat()
    var a=3.14*r*r
    println("The area of the circle is $a ")
    var p=2*3.14*r
    println("The perimeter of the circle is $p ")
    var s=p/4
    println("The side of the square is $s ")



}