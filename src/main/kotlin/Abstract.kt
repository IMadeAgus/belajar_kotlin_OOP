package org.example

/* Abstraction adalah konsep di mana Anda menyembunyikan detail tertentu dari implementasi suatu objek
dan hanya menunjukkan fungsionalitas yang relevan atau penting bagi pengguna objek tersebut
Jadi, pada kelas induknya kita hanya mendefinisikan nama method dan property-nya saja */


//tambahkan keyword abstract
abstract  class Book (val name: String, val price: Int) {
    fun name(){

    }
}

class Adventure(pName: String, pPrice: Int) : Book(pName, pPrice) {
     fun name(pName: String) {
       return println(pName)
     }
}
fun main() {
    val adventureBook = Adventure("Tintin", 10000)
    println(adventureBook.name)
    //Dengan menggunakan abstract class, class book tidak bisa dinisialisasikan menjadi objek
    //val book = Book("Tintin", 10000)
    // Output: cannot create an instance of an abstract class
}