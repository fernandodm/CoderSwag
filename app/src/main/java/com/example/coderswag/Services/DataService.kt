package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")

    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie", "$18", "hat1","M"),
        Product("Devslopes Hat Black", "$20", "hat2", "L"),
        Product("Devslopes Hat White", "$18", "hat3", "S"),
        Product("Devslopes Hat Snapback", "$22", "hat4", "M")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray", "$28", "hoodie1", "XL"),
        Product("Devslopes Hoodie Red", "$32", "hoodie2", "M"),
        Product("Devslopes Gray Hoodie", "$28", "hoodie3", "S"),
        Product("Devslopes Black Hoodie", "$32", "hoodie4", "XS")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black", "$88", "shirt1", "XS"),
        Product("Devslopes Badge Light Gray", "$20", "shirt2", "S"),
        Product("Devslopes Logo Shirt Red", "$22", "shirt3", "M"),
        Product("Devslopes Hustle", "$22", "shirt4", "XXL"),
        Product("Kickflip Studios", "$18", "shirt5", "L")
    )

    val digitalGood = listOf<Product>()

    fun getProducts(category: String) : List<Product>{
        return when(category){
                    "SHIRTS" -> shirts
                    "HATS" -> hats
                    "HOODIES" -> hoodies
                    else -> digitalGood
                }
    }
}