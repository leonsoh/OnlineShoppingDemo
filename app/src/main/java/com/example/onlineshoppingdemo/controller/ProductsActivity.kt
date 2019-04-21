package com.example.onlineshoppingdemo.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.onlineshoppingdemo.R
import com.example.onlineshoppingdemo.utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)
    }
}
