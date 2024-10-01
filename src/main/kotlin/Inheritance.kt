package org.example

//Inheritance (Pewarisan)
//untuk membuat parent class gunakan => open class ParentClass
// open ini diperlukan karena class pada kotlin secara default bersifat final, jadi harus diubah menjadi open supaya bisa di extends
open class MammalAnimal(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean){

    open fun eat(){
        println("$name sedang makan!")
    }

    open fun sleep(){
        println("$name sedang tidur!")
    }
}

//untuk melakukan extends dari parent class gunakan : ( class ChildClass: ParentClass )

class Cats(pName: String, pWeight: Double, pAge: Int, pIsCarnivore: Boolean, val furColor: String, val numberOfFeet: Int)
    : MammalAnimal(pName, pWeight, pAge, pIsCarnivore) {

    fun playWithHuman() {
        println("$name bermain bersama Manusia !")
    }

    //Mengambil Alih Penuh / mengubah fungsi dari parent class
    override fun eat(){
        println("$name sedang memakan ikan !")
    }



    override fun sleep() {
        //  Guakan Super Jika Hanya Ingin Menambbahkan inplementasi dari parent class
        super.sleep()
        println("$name sedang tidur di bantal !")
    }
}
fun main(){
    val dicodingCats = Cats("Dicoding Miaw", 3.2, 2, true, "Brown", 4)

    dicodingCats.playWithHuman()
    dicodingCats.eat()
    dicodingCats.sleep()
}