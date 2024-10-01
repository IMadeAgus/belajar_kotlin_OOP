package org.example

/*Kotlin memungkinkan kita untuk menambahkan
sebuah fungsi baru pada sebuah kelas tanpa harus mewarisi kelas tersebut.*/

//Extension Functions
//melakukan exstension function dari final class Int
fun Int.printInt() { //kita perlu menentukan terlebih dahulu receiver type
    //kelas Int pada kode di atas digunakan sebagai receiver type,
    // sedangkan kata kunci this adalah receiver type yang bertindak sebagai objeknya.
    print("value $this")
}

//Exstension Properties
//Deklarasinya pun sama seperti extension functions.
//Kita terlebih dahulu menentukan receiver type kemudian nama dari properti tersebut.
val Int.slice: Int
    get() = this / 2

//Iflix Function
infix fun Int.sum(value: Int): Int {
    return this + value
}

/*Namun, ada beberapa syarat untuk menggunakan infix function.
1. Infix function harus merupakan sebuah member function atau extension function.
2. Harus memiliki satu parameter saja.
3. Parameter tidak boleh berupa generic dan tidak memiliki nilai default.*/

//Kurang Ngerti
class MyHero {
    infix fun addHero(s: String) { /*...*/ }

    fun build() {
        this addHero "Superman"   // Correct
        addHero("Spidermen")       // Correct
        //  addHero "Ironman"        // Incorrect: the receiver must be specified
    }
}


fun main() {
    10.printInt()
    println(10.slice)

    //Memanggil Idflix function
    val result = 5 sum 3

}