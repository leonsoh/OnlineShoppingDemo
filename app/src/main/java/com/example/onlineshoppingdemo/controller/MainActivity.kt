package com.example.onlineshoppingdemo.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.onlineshoppingdemo.R
import com.example.onlineshoppingdemo.adapters.CategoryAdapter
import com.example.onlineshoppingdemo.model.Category
import com.example.onlineshoppingdemo.services.DataService
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        adapter = CategoryAdapter(this, DataService.categories)

        categoryListView.adapter = adapter
    }
}
