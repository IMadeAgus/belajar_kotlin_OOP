package org.example
//Interface
/*Tujuan dari interface ini hanya untuk diimplementasikan oleh sebuah kelas
* Kelas yang mengimplementasikan sebuah interface diharuskan melakukan override seluruh properti dan
* fungsi sekaligus mendefinisikan isi fungsi yang terdapat pada interfaces-nya.*/

interface IFly {
    fun fly()
    val name: String
}

//Override pada properti bisa juga dilakukan pada constructor
class Bird(override val name: String) : IFly {
    override fun fly() {
        println("$name is Flying")
    }
}