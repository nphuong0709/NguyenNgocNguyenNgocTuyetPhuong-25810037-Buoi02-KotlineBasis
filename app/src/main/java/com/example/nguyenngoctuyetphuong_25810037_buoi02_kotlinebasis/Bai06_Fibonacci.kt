package com.example.nguyenngoctuyetphuong_25810037_buoi02_kotlinebasis

fun main() {
    val diem = 8.2
    var soThuNhat = 0
    var soThuHai = 1

    for (viTri in 1..20) {
        if (soThuNhat >= 100) {
            break
        }

        println("Vi tri $viTri: $soThuNhat")

        val soTiepTheo = soThuNhat + soThuHai
        soThuNhat = soThuHai
        soThuHai = soTiepTheo
    }
}