package org.example

//Primary Constructor
/*Kita bisa langgsung mengisi nilai pada object ketika object itu dibuat
* Kita juga bisa menambahkan nilai default ke dalamnya*/

class Food(val foodName: String, val price: Int = 1000)

//Kita juga bisa menggunakan init block
class Goat(name: String, weight: Double, age: Int, isMammal: Boolean) {
    val name: String
    val weight: Double
    val age: Int
    val isMammal: Boolean

    init {
        this.weight = if(weight < 0) 0.1 else weight
        this.age = if(age < 0) 0  else age
        this.name = name
        this.isMammal = isMammal
    }
}
fun main() {
    val rice = Food("shirataki", 10000)
    println(rice.foodName)
    println(rice.price)
    val mountainGoat = Goat("elly", 20.1,10, true)
    println(mountainGoat.name)
}