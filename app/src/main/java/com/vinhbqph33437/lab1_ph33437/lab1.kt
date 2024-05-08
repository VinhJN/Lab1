package com.vinhbqph33437.lab1_ph33437

fun main(){
    println("Lab1 - MD18305")

    //Khai báo biến: cách 1 - dùng val
    val a = 1
    val b = 2
    val c = a + b
    println("Tổng 2 số $a và $b là $c");

    //Khai báo biến - ra kiểu dữ liệu
    val sothunhat : Int = 3
    val sothuhai : Float = 4f
    val mess : String = "Tích 2 số $sothunhat và $sothuhai là: ${sothunhat * sothuhai}"
    println(mess)

    println(phepChia(5f, 6f))
}

fun phepChia (soA: Float, soB: Float): Float {
    if(soB == 0f){
        return 0f
    }
    val thuong = soA / soB

    return thuong
}

class lab1 {
}