package com.gibbs.myfirstapp.andoidMaster.excersise

fun main(){
    val mornignNotification = 51
    val eveningNotification = 135

//    printNotificationSumary(mornignNotification)
    printNotificationSumary(eveningNotification)
}

fun printNotificationSumary(numberOfMessage: Int){
    //fill
    if (numberOfMessage >= 100){
        println("Your phone is bloqued up! You have 99+ notifications")
    } else{
        println("You have $numberOfMessage notifications")
    }
}