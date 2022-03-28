package com.example.myapp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        /// creating an array to have multiple values for the spinner
        val favoriteDrink = arrayOf("Coffee", "Tea", "Water", "Pepsi", "7up", "Zaki")
        val Result: TextView = findViewById(R.id.textView6)

        val spinnerVal: Spinner = findViewById(R.id.spinner)
        spinnerVal.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, favoriteDrink)
        spinnerVal.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                Result.text = favoriteDrink[p2]
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
    }
}