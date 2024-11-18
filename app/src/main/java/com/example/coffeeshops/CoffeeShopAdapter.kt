package com.example.coffeeshops

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CoffeeShopAdapter(
    private val context: Context,
    private val coffeeShops: List<CoffeeShop>
) : RecyclerView.Adapter<CoffeeShopAdapter.CoffeeShopViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoffeeShopViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_coffee_shop, parent, false)
        return CoffeeShopViewHolder(view)
    }

    override fun onBindViewHolder(holder: CoffeeShopViewHolder, position: Int) {
        val coffeeShop = coffeeShops[position]
        holder.imageView.setImageResource(coffeeShop.imageResource)
        holder.textViewTitle.text = coffeeShop.name
        holder.textViewSubtitle.text = coffeeShop.street

        // Configurar el RatingBar
        holder.ratingBar.setOnRatingBarChangeListener { _, rating, _ ->
            holder.textViewRating.text = "Rating: $rating"
        }
    }

    override fun getItemCount(): Int = coffeeShops.size

    class CoffeeShopViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val textViewTitle: TextView = itemView.findViewById(R.id.textViewTitle)
        val textViewSubtitle: TextView = itemView.findViewById(R.id.textViewSubtitle)
        val ratingBar: RatingBar = itemView.findViewById(R.id.ratingBar)
        val textViewRating: TextView = itemView.findViewById(R.id.textViewRating)
    }
}
