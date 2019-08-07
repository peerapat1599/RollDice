package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = "Dice Rolled!"

        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener { resetDice() }

    }

    private fun resetDice() {
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = "0".toString()
    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6)+1
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
        Toast.makeText(this,"button clicked", Toast.LENGTH_SHORT).show()
    }
}
