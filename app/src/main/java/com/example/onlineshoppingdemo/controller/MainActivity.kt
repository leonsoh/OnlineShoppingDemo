package com.example.onlineshoppingdemo.controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.onlineshoppingdemo.R
import com.example.onlineshoppingdemo.adapters.CategoryAdapter
import com.example.onlineshoppingdemo.adapters.CategoryRecyclerViewAdapter
import com.example.onlineshoppingdemo.model.Category
import com.example.onlineshoppingdemo.services.DataService
import com.example.onlineshoppingdemo.utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        adapter = CategoryRecyclerViewAdapter(this, DataService.categories) { category ->
            val productIntent = Intent(this, ProductsActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY, category.title)
            startActivity(productIntent)
        }

        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager

    }
}
