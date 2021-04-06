package com.example.assessment
import java.util.*
class Customer
{
    var CustomerName:String?=" "
    var MobileNo:Long=0
    var Address:String?=" "
    var id = 0
    var name =""
    var quantity = 0.toLong()
    var price = 0.toFloat()

fun insertitem() {
    val sc = Scanner(System.`in`)

    print("enter the number of item You have purchased")
    var item= sc.nextInt()
    var sum=0
    val list = ArrayList<Any>()
    var total = 0.toFloat()
    for (i in 1..item)
    {
        println("Sale Details of $i item")
        println()
        print("Item ID : ")
        id  = sc.nextInt()
        list.add(id)
        print("Item Name: ")
        name = sc.next()
        list.add(name)
        print("Item Price : ")
        price = sc.nextFloat()
        list.add(price)
        print("Item Quantity : ")
        println()
        quantity = sc.nextLong()
        list.add(quantity)
        total += price * quantity
    }
    for (i in list)
    {
        when(i){
            is Int -> print(" Item ID : $i \n")
            is String -> print(" Item name : $i \n")
            is Float -> print(" Item Price: $i \n")
            is Long -> print(" Quantity : $i \n")
        }
    }
    println(" ---------------- $CustomerName BILL DETAILS : ---------------    "      )
    println("----------------- $CustomerName SHOPPING DETAILS ARE : ----------------- " )
    println(" NAME : $CustomerName")
    println(" MOBILE NUMBER : $MobileNo")
    println(" ADDRESS : $Address")
    println("--------------PURCHASE DETAILS ARE : --------------------"      )
    println()
    println(" -----------TOTAL BILL AMOUNT -----------  ")
    println("TOTAL AMOUNT IS $total")
}
}



    fun main() {
        val sc = Scanner(System.`in`)
       val obj1=Customer()


        print("Enter the employee name : ")
        var name= readLine()
        obj1.CustomerName=name
        print("Enter the employee mobile : ")
        var mob= sc.nextLong()
        obj1.MobileNo=mob
        print("Enter the employee address: ")
        var add= readLine()
        obj1.Address=add

        obj1.insertitem()

}

