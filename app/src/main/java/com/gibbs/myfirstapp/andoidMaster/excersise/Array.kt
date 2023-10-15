package com.gibbs.myfirstapp.andoidMaster.excersise

//Arrays en Kotlin, secuencia de datos, arrays con tamaños fijos, e inmutables
fun main(){
    val weekDays = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    println(weekDays.size)

    weekDays[3] = "Dia no laborable"
    println(weekDays[4])

    //Bucles para Arrays
    for (position in weekDays.indices){
        println(weekDays[position])
    }



    for ((position, value ) in weekDays.withIndex()){
//        println("La posicion $position, contiene: $value")
    }

    for (weekday in weekDays){
        println("Los dias de la semana: $weekday")
    }




}