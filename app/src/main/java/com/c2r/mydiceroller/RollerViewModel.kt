package com.c2r.mydiceroller

import androidx.lifecycle.ViewModel

class RollerViewModel: ViewModel() {

    fun getDrawableDiceImage() : Int {
        val randomInt = (1..6).random()
        val drawableResource = when(randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        return drawableResource
    }
}