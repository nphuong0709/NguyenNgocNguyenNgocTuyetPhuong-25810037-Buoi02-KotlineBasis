package com.example.nguyenngoctuyetphuong_25810037_buoi02_kotlinebasis

fun main() {
    val danhSachSach = mutableListOf(
        "Ngay dem va em",
        "Troi xanh gio nhe",
        "Nhat tung thien mon",
        "Harry Potter",
        "Dau chan tren cat"
    )

    println("Danh sach ban dau:")
    println(danhSachSach)

    danhSachSach.add("Ngay xuan tuoi sang")
    danhSachSach.add("Khi hoi tho hoa thinh khong")

    danhSachSach.remove("Harry Potter")

    danhSachSach.sort()

    println("Danh sach sau khi xu ly:")
    println(danhSachSach)

}