package org.example

//Overloading (polymorphism )
/* Dari sisi kode, polimorphism dapat diartikan sebagai sebuah nama fungsi
yang dapat melakukan hal yang yang bermacam-macam*/

class Snake(private var name: String) {

    //Semua function dibawah memiliki nama yang sama tetapi parameter yang berbeda, sehingga fungsinya dpt berubah-ubah)

    fun eat() {
        println("$name makan!")
    }

    fun eat(typeFood: String) {
        println("$name memakan $typeFood!")
    }

    fun eat(typeFood: String, quantity: Double) {
        println("$name memakan $typeFood sebanyak $quantity grams!")
    }

    fun sleep() {
        println("$name tidur!")
    }
}
fun main() {
    val dicodingSnake = Snake("Dicoding Miaw")

    dicodingSnake.eat()
    dicodingSnake.eat("Ikan Tuna")
    dicodingSnake.eat("Ikan Tuna", 450.0)
}

/*
    Output:
    Dicoding Miaw makan!
    Dicoding Miaw memakan Ikan Tuna!
    Dicoding Miaw memakan Ikan Tuna sebanyak 450.0 grams!
*/