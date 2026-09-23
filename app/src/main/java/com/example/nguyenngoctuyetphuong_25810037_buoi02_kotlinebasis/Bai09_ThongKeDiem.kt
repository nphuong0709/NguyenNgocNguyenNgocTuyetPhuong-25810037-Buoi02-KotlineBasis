package com.example.nguyenngoctuyetphuong_25810037_buoi02_kotlinebasis

fun main() {
    val diem = arrayOf(
        2.0, 8.0, 7.5, 9.0, 10.0
    )

    var tong = 0.0
    var diemCaoNhat = diem[0]
    var diemThapNhat = diem[0]

    for (i in diem) {
        tong = tong + i

        if (i > diemCaoNhat) {
            diemCaoNhat = i
        }

        if (i < diemThapNhat) {
            diemThapNhat = i
        }
    }

    val diemTrungBinh = tong / diem.size

    println("Diem trung binh: $diemTrungBinh")
    println("Diem cao nhat: $diemCaoNhat")
    println("Diem thap nhat: $diemThapNhat")

}