package com.example.onlineshoppingdemo.services

import com.example.onlineshoppingdemo.model.Category
import com.example.onlineshoppingdemo.model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")

    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie", "$18", "hat1"),
        Product("Devslopes Hat White", "$20", "hat2"),
        Product("Devslopes Hat Black", "$18", "hat3"),
        Product("Devslopes Hat Snapback", "$22", "hat4"),
        Product("Devslopes Graphic Beanie", "$18", "hat1"),
        Product("Devslopes Hat White", "$20", "hat2"),
        Product("Devslopes Hat Black", "$18", "hat3"),
        Product("Devslopes Hat Snapback", "$22", "hat4"),
        Product("Devslopes Graphic Beanie", "$18", "hat1"),
        Product("Devslopes Hat White", "$20", "hat2"),
        Product("Devslopes Hat Black", "$18", "hat3"),
        Product("Devslopes Hat Snapback", "$22", "hat4")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Grey", "$30", "hoodie1"),
        Product("Devslopes Hoodie Red", "$20", "hoodie2"),
        Product("Devslopes Hoodie Gray", "$40", "hoodie3"),
        Product("Devslopes Hoodie Black", "$30", "hoodie4")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black", "$15", "shirt1"),
        Product("Devslopes Badge Light gray", "$15", "shirt2"),
        Product("Devslopes Logo Shirt Red", "$15", "shirt3"),
        Product("Devslopes Hustle", "$15", "shirt4"),
        Product("Kickflip Studios", "$15", "shirt5")
    )

    val digitalGoods = listOf<Product>()

    fun getProducts(category: String): List<Product> {
        return when(category) {
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGoods
        }
    }
}