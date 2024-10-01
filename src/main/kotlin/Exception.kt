package org.example

//Exception adalah event (kejadian) yang dapat mengacaukan jalannya suatu program
//Bisa kita antisipasi menggunakan try catch dan try catch finally

fun main() {
    val someNullValue: String? = null
    lateinit var someMustNotNullValue: String
    val someStringValue: String? = null
    var someIntValue: Int = 0

    try {
        someMustNotNullValue = someNullValue!!
        println(someMustNotNullValue)
    } catch (e: Exception) { //Jika terjadi exception maka program tidak akan terhenti atau crash, namun akan dilempar menuju blok catch
        someMustNotNullValue = "Nilai String Null"
        println(someMustNotNullValue)
    }

    //try catch finally
    try {
        someMustNotNullValue = someNullValue!!
    } catch (e: Exception) {
        someMustNotNullValue = "Nilai String Null"
    } finally {
        println(someMustNotNullValue) //finally akan dieksekusi setelah program keluar dari blok try ataupun catch.
    }

    // Multiple Exception
    try {
        someIntValue = someStringValue!!.toInt()
    } catch (e: NullPointerException) {
        someIntValue = 0
    } catch (e: NumberFormatException) {
        someIntValue = -1
    } finally {
        when(someIntValue){
            0 -> println("Catch block NullPointerException terpanggil !")
            -1 -> println("Catch block NumberFormatException terpanggil !")
            else -> println(someIntValue)
        }
    }
}