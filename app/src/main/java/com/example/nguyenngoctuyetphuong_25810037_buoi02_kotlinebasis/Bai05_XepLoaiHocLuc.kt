package com.example.nguyenngoctuyetphuong_25810037_buoi02_kotlinebasis

fun main() {
    val diem = 8.2

    val xepLoai = when (diem) {
        in 8.5..10.0 -> "Xuat sac"
        in 8.0..8.4 -> "Gioi"
        in 6.5..7.9 -> "Kha"
        in 5.0..6.4 -> "Trung binh"
        in 0.0..4.9 -> "Yeu"
        else -> "Diem khong hop le"
    }

    println("Diem: $diem")
    println("Xep loai: $xepLoai")
}