package org.example

class Cat{
    val name: String = "Dicoding Miaw"
    val weight: Double = 4.2
    val age: Int = 2
    val isMammal: Boolean = true
}

fun main(){
    val dicodingCat = Cat() //Otaomatis nengisi nilai secara default
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}" )
}

/*
output:
    Nama: Dicoding Miaw, Berat: 4.2, Umur: 2, mamalia: true
*/