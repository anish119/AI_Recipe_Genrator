package com.example.airecipiegenerator


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtIngredients = findViewById<EditText>(R.id.edtIngredients)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val txtRecipe = findViewById<TextView>(R.id.txtRecipe)

        btnGenerate.setOnClickListener {
            val ingredients = edtIngredients.text.toString().trim()

            if (ingredients.isNotEmpty()) {
                txtRecipe.text = "Generating recipe for: $ingredients..."
                // Next, we will integrate AI to generate real recipes!
            } else {
                txtRecipe.text = "Please enter some ingredients."
            }
        }
    }
}
