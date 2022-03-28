package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val NextPage = findViewById<Button>(R.id.button5)
        val Addition = findViewById<Button>(R.id.button1)
        val Subtraction = findViewById<Button>(R.id.button2)
        val Multipliation = findViewById<Button>(R.id.button3)
        val Division = findViewById<Button>(R.id.button4)
        val FirstNumber: EditText = findViewById(R.id.editTextNumber)
        val SecondNumber: EditText = findViewById(R.id.editTextNumber2)
        val Result: TextView = findViewById(R.id.textView3)

        NextPage.setOnClickListener {
            startActivity(Intent(this@MainActivity,HomeActivity::class.java))
        }

        Addition.setOnClickListener{
            var x: Float = FirstNumber.text.toString().toFloat();
            var y: Float = SecondNumber.text.toString().toFloat()
            Result.text = Addition(x,y).toString();
        }

        Subtraction.setOnClickListener{
            var x: Float = FirstNumber.text.toString().toFloat();
            var y: Float = SecondNumber.text.toString().toFloat()
            Result.text = Subtraction(x,y).toString();
        }

        Multipliation.setOnClickListener{
            var x: Float = FirstNumber.text.toString().toFloat();
            var y: Float = SecondNumber.text.toString().toFloat()
            Result.text = Multiplication(x,y).toString();
        }

        Division.setOnClickListener{
            var x: Float = FirstNumber.text.toString().toFloat();
            var y: Float = SecondNumber.text.toString().toFloat()
            Result.text = Division(x,y).toString();
        }
    }
}


/// functions of all 4 buttons

public fun Addition(a: Float, b: Float): Float {
    return a+b;
}

public fun Subtraction(a: Float, b: Float): Float {
    return a-b;
}

public fun Multiplication(a: Float, b: Float): Float {
    return a*b;
}

public fun Division(a: Float, b: Float): Float {
    return a/b;
}