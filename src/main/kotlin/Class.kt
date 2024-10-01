package org.example

//Class merupakan bluprint dari object, memiliki property dan method
class Vehicle() {
    val name: String = "Motor" //Jika mengggukanan val, kotlin hanya menghasilkan fungsi getter
    var year: Int = 2006 //Jika menggunakan var, kotlin akan menghasilkan fungsi setter dan getter

    fun go() {
        println("$name is go foward")
    }

    fun stop() {
        println("$name is Stop")
    }
}

fun main() {
    // Cara membuat object
    val Honda = Vehicle()
    println("Nama Motor : ${Honda.name}")
    Honda.go()
    Honda.stop()

    //Cara mengganti nilai dari property
    Honda.year = 2010
    println(Honda.year)

}