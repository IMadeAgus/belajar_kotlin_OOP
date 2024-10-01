package org.example

/*bagaimana jika kita tidak ingin menginisialisasi nilainya secara langsung? Misalnya,
 ada sebuah kondisi yang menyebabkan nilainya baru akan diinisialisasi nanti.
 Kita bisa menggunakan lateinit dan lazy*/

//Lateinit
lateinit var name: String //belum berisi nilai. Harus menggunakan var

//Lazy property
val lazyName: String by lazy { //lazy property untuk membuat property yang bukan null dan menunda inisialisasi. Harus menggunakan Val
    "Lazy Made"
}
fun main() {
    name = "I Made Agus Budiarta"
    if (::name.isInitialized) //Kita bisa mengecek var tersebut sudah diinisialisasi menggunakan isInitialized
        println(name)

    //dengan menggunakan lazy initialization, variabel tersebut baru akan diinisialisasi ketika benar-benar dibutuhkan saja.
    println(lazyName)
}