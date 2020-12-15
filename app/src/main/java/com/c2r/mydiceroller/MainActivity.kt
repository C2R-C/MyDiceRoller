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

        val countUp: Button = findViewById(R.id.count_button)
        countUp.setOnClickListener { countUp() }

    }

    private fun rollDice() {

        val resultTex = findViewById<TextView>(R.id.result_text)
        val randomInt = (1..6).random()
        resultTex.text = randomInt.toString()
    }

    private fun countUp() {

        val resultTex = findViewById<TextView>(R.id.result_text)
        val item = resultTex.text.toString().take(1)
        var num: Int

        when (item) {
            "1" -> {
                num = item.toInt().plus(1)
                resultTex.text = num.toString()
            }
            "2" -> {
                num = item.toInt().plus(1)
                resultTex.text = num.toString()
            }
            "3" -> {
                num = item.toInt().plus(1)
                resultTex.text = num.toString()
            }
            "4" -> {
                num = item.toInt().plus(1)
                resultTex.text = num.toString()
            }
            "5" -> {
                num = item.toInt().plus(1)
                resultTex.text = num.toString()
            }
            "6" -> {
                resultTex.text
            }
            else -> resultTex.text = "1"


        }


    }
}