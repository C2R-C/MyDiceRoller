package com.c2r.mydiceroller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.c2r.mydiceroller.databinding.ActivityRollerBinding

@Suppress("DEPRECATION")
class RollerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRollerBinding
    private lateinit var viewModel: RollerViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_roller)
        viewModel = ViewModelProviders.of(this).get(RollerViewModel::class.java)

        binding.rollButton.setOnClickListener { rollDice() }
        binding.restoreButton.setOnClickListener { restore() }

    }

    private fun rollDice() {
        binding.diceImage1.setImageResource(viewModel.getDrawableDiceImage())
        binding.diceImage2.setImageResource(viewModel.getDrawableDiceImage())
    }

    /**
     * Restaura el valor del textview result_text a cero.
     */
    private fun restore() {

        binding.diceImage1.setImageResource(R.drawable.empty_dice)
        binding.diceImage2.setImageResource(R.drawable.empty_dice)
    }

}