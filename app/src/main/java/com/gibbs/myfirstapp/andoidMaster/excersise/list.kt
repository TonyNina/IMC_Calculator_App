package com.gibbs.myfirstapp.andoidMaster.excersise

fun main(){
    mutableList()

}

fun mutableList() {
    val weekDays: MutableList<String> =
        mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    weekDays.add(0, "GibbsDay")
    println(weekDays)

    if (weekDays.isEmpty()){
        //no se muestra nada
    } else{
        weekDays.forEach { weekDay -> println(weekDay) }
    }

}




fun inmutableList(){
    val readyOnly:List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
//    println(readyOnly.size)
//    println(readyOnly)
//    println(readyOnly[5])

    //FILTRAR
//    val example = readyOnly.filter { it.contains("M") }
//    println(example)

//    readyOnly.forEach{ weekday -> println(weekday) }



}




