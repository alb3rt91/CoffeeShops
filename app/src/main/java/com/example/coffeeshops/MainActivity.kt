package com.example.coffeeshops

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Datos de ejemplo
        val coffeeShops = listOf(
            CoffeeShop("Antico Caffè Greco", "St. Italy, Rome", R.drawable.images),
            CoffeeShop("La Casa del Café","St. Germany, Berlin", R.drawable.images1),
            CoffeeShop("The Roasted Bean","St. Colon, Madrid", R.drawable.images2),
            CoffeeShop("Espresso Corner","St. Diagonal, Barcelona", R.drawable.images3),
            CoffeeShop("Mocha Bliss", "St. Picadilly Circus, London",R.drawable.images4),
            CoffeeShop("Brew Haven","St. Àngel Guimerà, Valencia", R.drawable.images5),
            CoffeeShop("Latte Lounge", "St. Kinkerstraat, Amsterdam",R.drawable.images6)
        )

        val adapter = CoffeeShopAdapter(this, coffeeShops)
        recyclerView.adapter = adapter
    }
}
