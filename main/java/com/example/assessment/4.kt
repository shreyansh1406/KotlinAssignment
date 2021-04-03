package com.example.assessment

import java.util.*

fun main()
{
    var sum = 0

    var inputValue = Scanner(System.`in`)
    println("Enter Quantity")
    var x = inputValue.nextInt()
    println("Enter Price for Unit")
    var y = inputValue.nextInt()

    println("Bill is  ${x  * y } ")
    var totalBill = x * y
    var discountedAmount  =  0.15 * totalBill
    println(discountedAmount)
    var billAfterDiscount = (x * y) - discountedAmount

    println("After Discount bill is  $billAfterDiscount")

}