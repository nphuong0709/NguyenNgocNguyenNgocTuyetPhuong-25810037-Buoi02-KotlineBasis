package com.example.nguyenngoctuyetphuong_25810037_buoi02_kotlinebasis

fun main() {
    val soLuong: Int = 10
    val donGia: Double = 210000.0

    val tienHang = soLuong.toDouble() * donGia
    val thue = tienHang * 0.08
    val tongTien = tienHang + thue

    println("Tien hang: $tienHang VND")
    println("Thue vat: $thue VND")
    println("Tong tien hang: $tongTien VND")
}