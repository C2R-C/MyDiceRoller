package com.c2r.mydiceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val countUp: Button = findViewById(R.id.restore_button)
        countUp.setOnClickListener { restore() }

    }

    private fun rollDice() {

        val resultTex = findViewById<TextView>(R.id.result_text)
        val randomInt = (1..6).random()
        resultTex.text = randomInt.toString()
    }

    /**
     * Restaura el valor del textview result_text a cero.
     */
    private fun restore() {
        val restoreResultText = findViewById<TextView>(R.id.result_text)
        restoreResultText.text = "0"
    }

}