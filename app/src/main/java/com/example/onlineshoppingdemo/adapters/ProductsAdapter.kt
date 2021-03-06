package com.example.onlineshoppingdemo.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.onlineshoppingdemo.R
import com.example.onlineshoppingdemo.model.Product

class ProductsAdapter(val context: Context, val products: List<Product>, val itemClick: (Product) -> Unit ): RecyclerView.Adapter<ProductsAdapter.ProductHolder>( ) {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ProductHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.product_list_item, p0, false)
        return ProductHolder(view, itemClick)
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder?.bindProduct(products[position], context)
    }

    inner class ProductHolder(itemView: View?, val itemClick: (Product) -> Unit): RecyclerView.ViewHolder(itemView!!) {
        val productImage = itemView?.findViewById<ImageView>(R.id.productImage)
        val productName = itemView?.findViewById<TextView>(R.id.productName)
        val productPrice = itemView?.findViewById<TextView>(R.id.productPrice)

        fun bindProduct(product: Product, context: Context) {
            val resourceId = context.resources.getIdentifier(product.image, "drawable", context.packageName)
            productImage?.setImageResource(resourceId)
            productName?.text = product.title
            productPrice?.text = product.price
            itemView.setOnClickListener { itemClick(product) }
        }
    }
}