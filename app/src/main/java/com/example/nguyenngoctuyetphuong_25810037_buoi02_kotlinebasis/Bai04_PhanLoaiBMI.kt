package com.example.nguyenngoctuyetphuong_25810037_buoi02_kotlinebasis

fun main() {
    val canNang = 55.0
    val chieuCao = 1.63

    val bmi = canNang / (chieuCao * chieuCao)

    var xepLoai = ""

    if (bmi < 18.5) {
        xepLoai = "Gay"
    } else if (bmi < 25) {
        xepLoai = "Binh thuong"
    } else if (bmi < 30) {
        xepLoai = "Thua can"
    } else {
        xepLoai = "Beo phi"
    }

    println("BMI: $bmi")
    println("Phan loai: $xepLoai")

}