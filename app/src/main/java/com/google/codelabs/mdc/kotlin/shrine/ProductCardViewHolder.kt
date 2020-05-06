package com.google.codelabs.mdc.kotlin.shrine

import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.toolbox.NetworkImageView
import com.google.codelabs.mdc.kotlin.shrine.network.ProductEntry

class ProductCardViewHolder(itemView: View) //TODO: Find and store views from itemView
    : RecyclerView.ViewHolder(itemView){
    var productImage: NetworkImageView = itemView.findViewById(R.id.product_image)
    var productTitle: TextView = itemView.findViewById(R.id.product_title)
    var productPrice: TextView = itemView.findViewById(R.id.product_price)
    fun bind(isiProduct: ProductEntry){
        itemView.setOnClickListener{ view ->
            Toast.makeText(itemView.context,"Desc:  ${isiProduct.description}",Toast.LENGTH_LONG).show()
        }
    }
}
