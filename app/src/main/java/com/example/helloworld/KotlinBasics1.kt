package com.example.helloworld

import java.lang.IllegalArgumentException

fun main(){
    var c = Car()
    //c.model="m5" error
    c.maxSpeed // getter is not private


}

class Car(){
    lateinit var owner : String //lateinint doesn't mean that there is gonna be a lateinit block
                                //it means that the variable will be initialised later in a init block
    val myBrand: String = "BMW"
    get() {  //custom getter
        return field.toLowerCase() //field refers to the variable itself

    }
    var maxSpeed: Int = 250
          /*get() = field
          set(value) {
              field = value
          }*/ //default code associated with values of getting and seting varaibles
    set(value) {
              field = if(value > 0) value else throw IllegalArgumentException("Max speed cannot be lower than zero") //if statement in a single line
          }
    var model = "m8"
    private set   //so if we set private set, the variable cannot be set from outside the class, but we can get it, if thats not set private


    init {
        this.model= "m5"   // will work as this is inside class
        this.owner="Himaghna"
    }

}
data class User(val id: Long, var name: String) // val and var type of parameters should be mentioned
fun main1(){
    val user1=User(1,"Himaghna")

    user1.name="Michael"
    val user2=User(1,"Michael")
    println(user1.equals(user2)) //functionality of data class
    println(user1==user2)
    println("user detail $user1")//toString() another application of data class
    val updatedUser = user1.copy(name="x")// iin the brackets write parameter you want to, in place of being copied, from the original
            //in this case the name shall change to x but the id stays1
    println(updatedUser.component1())// prints 1, another functionality of data class, component function
    val (id,name)=updatedUser
    /*val id=updatedUser.id
    val name = updatedUser.name, all this is written in the single line above*/
    //deconstruction, the phenomenon above is another feature of Data class, so after this the default values is of UpdatedUser


}
