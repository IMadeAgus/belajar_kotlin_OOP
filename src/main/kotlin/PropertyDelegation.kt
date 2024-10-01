package org.example

import kotlin.reflect.KProperty

//class Delegate, membuat 1 class untuk mengelola fungsi setter dan getter
class DelegateGenericClass {
    private var value: Any = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>) : Any {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: Any){
        println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class Computer() {
    //untuk mendelefasikan sebuah property, gunakan keyword by dalam inisiasi property tsb
    var name: Any by DelegateGenericClass()  //Dengan begitu nilai properti name dikelola melalui kelas DelegateGenericClass
}

class Laptop {
    var name: Any by DelegateGenericClass()
}

fun main() {
    val asus = Computer()
    asus.name = "Asus Rog"

    val acer = Laptop()
    acer.name = "Acer 123"
}