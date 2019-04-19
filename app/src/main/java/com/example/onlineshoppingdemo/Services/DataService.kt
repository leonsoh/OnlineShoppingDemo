package com.example.onlineshoppingdemo.Services

import com.example.onlineshoppingdemo.Model.Category
import com.example.onlineshoppingdemo.Model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "digitalgoodsimage")

    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie", "$18", "hat01"),
        Product("Devslopes Hat White", "$20", "hat02"),
        Product("Devslopes Hat Black", "$18", "hat03"),
        Product("Devslopes Hat Snapback", "$22", "hat04")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Grey", "$30", "hoodie01"),
        Product("Devslopes Hoodie Red", "$30", "hoodie02"),
        Product("Devslopes Hoodie Gray", "$30", "hoodie03"),
        Product("Devslopes Hoodie Black", "$30", "hoodie04")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black", "$15", "shirt01"),
        Product("Devslopes Badge Light gray", "$15", "shirt02"),
        Product("Devslopes Logo Shirt Red", "$15", "shirt03"),
        Product("Devslopes Hustle", "$15", "shirt04"),
        Product("Kickflip Studios", "$15", "shirt05")
    )
}