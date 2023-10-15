package com.gibbs.myfirstapp.andoidMaster.excersise

//Funcion: contenedor de operaciones

//Var general

val edad:Int = 22;

fun main(){
    showMyName()
    showMyAge(25)
    add(25, 67)
    val mySubstract = substract(15, 6)
    println(mySubstract)
}

fun showMyName(){
    println("THola me llamo Tony")
}

//Parametro con valor por defecto
fun showMyAge(currentAge:Int = 35){
    println("Tengo $currentAge años")
}

fun add(firstNum:Int, secondNum:Int){
    println(firstNum + secondNum)
}

fun substract(firstNum:Int, secondNum:Int):Int {
    return firstNum - secondNum
}

fun substractCool(firstNum:Int, secondNum:Int):Int = firstNum - secondNum



fun varAlfanumericas(){

    /**
     * Variables alfanumericas
     * **/
    //Char - un solo caracter
    val CharExample:Char = 'a';
    val CharExample2:Char = '2';
    val CharExample3:Char = '@';

    //String
    val nombre:String = "Gibbs";
    val stringExample2:String = "4"
    val stringExample3:String = "6"

    //println(stringExample2.toInt() + stringExample3.toInt())

    var miPresentacion:String = "Hola yo me llamo: $nombre y tengo $edad"

    print(miPresentacion)


}

fun varBoolean(){
    //Boolean
    val booleanExmaple:Boolean = true;


}

fun varaNum(){


    //varaibles númericas

    var edad2:Int = 25;



    //DOUBLE
    val double:Double = 2424.242;

    /**
     * Variables alfanumericas
     * **/
    //Char - un solo caracter
    val CharExample:Char = 'a';
    val CharExample2:Char = '2';
    val CharExample3:Char = '@';

}