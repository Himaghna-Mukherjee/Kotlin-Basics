package com.example.helloworld

fun random() {//https://blog.kotlin-academy.com/  dictionary for all important kotlin keywords
    var name1 = "x"//type inference
    val name2 = "y"
    name1 = "z"
    //todo: do stuff
    println("the name is " + name1)
    println("the name is " + name2)
    val myByte: Byte = 12  // the colon and then the datatype is for explicitely converting the variable
    val myShort: Short = 125
    val myInt: Int = 123421
    val myLong: Long = 12_12_123_1234242//we can use underscore for long for more readability
    val myFloat: Float = 13.37F
    val myDouble: Double = 3.121321312312313
    var isSunny: Boolean = true
    var bool = true
    val letterChar = 'A'
    val myStr = "Himaghna Mukherjee"
    var ch1 = myStr[0]
    var lastChar = myStr[myStr.length - 1]//.length for finding length
    var result = 5 + 3
    val a = 5.0
    val b = 3
    result = (a / b).toInt()//for explicit type conversion to integer
    //comparison operators (==, !=, <, >, <=, >=)
    val isEqual = 5 == 3 //will give boolean result
    println("isEqual is $isEqual")// the dollar is a template which pretty much separates the stuff and does the same job, we can use this for any print statement
    println("is5greater3 ${5>3}") //pretty much what we are doing here is telling hte compiler to execute the code within the braces after the $ and then give the result along with the statement we can do this when there are multiple variables
    //assignment operators (=,+=,-=,*=,/=,%=)
    var hP1 = 170
    var hP2 = 159

    if(hP1 > hP2) {                    //try using hte indentation format given here
        println("use raw force")       //if the first if expression is true the other else ifs and elses shall not be executed
    }else if(hP1 == hP2) {
        println("use your power technique 1337")
    }else {
        println("use technique")

    }
    var isRainy = true
    if(isRainy){
        println("its rainy")
    }
    var month = 3
    when(month) {
        1 -> println("shit")
        2 -> println("bugger")
        3 -> {
            println("cheeky")
            println("bastard") //we can execute multiple lines of code also
        }
        else -> println("are you nuts")
    }
    var month1 = 12
    when(month) {
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        //in 12..2 -> println("Winter"), won't work because this is empty
        //in 12 downTo 2 -> println("Winter") won't work either because the values would be 12,11,10,...4,3,2
        12, 1, 2 -> println("Winter")
        else -> println("Invalid season")
    }
    var age = 1000
    when(age) {
        in 21..150 -> println("you may drink in the US")
        in 18..20 -> println("you may vote in the US")
        16, 17 -> println("you may drive in the US")
        else -> println("you're to young to do any of these")
    }
    var x : Any = 13.37 //any is superclass of all classes and hence x pretty much represents an object we can inherit properties of any class

    when(x){
        is Int -> println("$x is an Int")// is keyword can be used only in datatype checks in when blocks
        is Double -> println("$x is a Double")
        is String -> println("$x is a string")// we can also use "!is" like "!in"
        else -> println("$x is none of these")
    }
    var z = 100
    while(z >= 0){
        println("$z")
        z-=2
    }
    var t=1
    do {
        println("$t")
        t++
    }while (t<=10)
    var feltTemp = "cold"
    var roomTemp = 10
    while (feltTemp == "cold"){
        roomTemp++
        if(roomTemp >+ 20) {
            feltTemp = "comfy"
            println("it's comfy now")
        }

    }
    for (i in 1..10){// no need to declare loop counter variable
        println("$i")
    }
    for (i in 1 until 10){//use until for normal execution
        println("$i")

    }
    for (i in 10 downTo 1 step 2){
        println("$i")
    }
    for (i in 1.until(10).step(2)){
        println("$i")
    }
    for (i in 10.downTo(1).step(2)){
        println("$i")
    }
    myFunction()
    myFunction()
    addUp(5,3)  //arguemnets 5 and 3
    //null pointers or nullables
    var name :String = "Himaghna"
    name = "Adam"
    //name =null this is not possible because the variable is of string type and not nullable
    var whatever : String? = "Whatever" //the question mark makes this a nullable, the question mark is called the safe call operator
    whatever = null
    var len = name.length
    //var len2 = whatever.length   compilation error, the containing variable has to be of null type too
    //old way to solve this problem below
    /*if(whatever != null){
        var len2=whatever.length
    }else{
        null  //returns null if the containing value of whatever is null
    }*/
    var len2=whatever?.length//new way, all the code above is expressed via this single line in kotlin
    //println(whatever?.toLowerCase())  we can do this but this is showing error because whatever is already null
    whatever?.let{println(it.length)}//use this if you actually want to print stuff with nullables,use it for the variable name during printing
    //val q = whatever not possible
    // ?: is elvis operator
    val q = whatever ?: "Null shit here" //this returns the string after the elvis operator if the value is null
    println("whatever is $q")
    //not-null assertion operator converts a nullable type to a non-nullable type and returns the null pointer exception if the value is null, so very risky, use only when sure that it holds a value
    println(whatever!!.toLowerCase())

    //val wifesAge: String? = user?.wife?.age ?: 0         this is to show that we can use the safecall and elvis operators in chain, here user is a class btw







    






    


}
fun myFunction(){//method is a function within a class, the functions in this code are functions because they are not within a class
    println("i was called")
}

fun addUp(a: Int, b: Int) : Int{     //fun function-name(parameter1,parameter2...) : return_type{
    return a+b// only one return statement for each function
}

fun main(){
    //var Himaghna: Person = Person("Himaghna","Mukherjee")
    var Himaghna = Person("Himaghna", "Mukherjee", 19) //object creation
    Himaghna.stateHobby()
    var someoneElse = Person("John","Doe")
    someoneElse.hobby="fuck off"
    someoneElse.stateHobby()
    var Himaghna1= Person1(lastName1="Mukhopadhyay")
}
//class Person constructor(firstName: String, lastName: String)
//class Person public constructor(firstName: String, lastName: String)
class Person(firstName: String, lastName: String){
    // member variables/ properties
    var age : Int? = null //is in case we do not have the data of age we still want the program to run, null is default value
    var hobby : String = "write poems"
    init { //this is the initializer, called once an object is created, we can use this to initialize your object or in simple terms prepare the object
        println("Person created with firstname $firstName and lastname $lastName")


    }
    constructor(firstName: String, lastName: String, age: Int): //secondary constructor adds to the primary one
            this(firstName,lastName){
                this.age =age
            }//this keyword is used because firs.. are parameters and cannot be used inside, so this removes the confusion and uses the one inside current object

    fun stateHobby(){
        println("my hobby is $hobby")
    }
// in kotlin everything is an object even int is a class, type int you would see c
}
class Person1(firstName1: String="John", lastName1: String="Doe"){
    init{
        println("Person created with firstname $firstName1 and lastname $lastName1")
    }
}
