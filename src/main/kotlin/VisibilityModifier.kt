package org.example

class Mammal(private var name: String, private val weight: Double, private val age: Int, private val isMammal: Boolean = true) {

    fun getName() : String {
        return  name
    }
    fun setName(newName: String) {
        name = newName
    }
}

fun main(){
    val dicodingCat = Mammal("Dicoding Miaw", 2.5, 2)
    println(dicodingCat.getName())
    dicodingCat.setName("gugud")
    println(dicodingCat.getName())
}

