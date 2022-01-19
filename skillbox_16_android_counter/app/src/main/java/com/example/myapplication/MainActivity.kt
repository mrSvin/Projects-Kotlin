package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import com.example.myapplication.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    var counter = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.textPlaces.text = "Все места свободны"
//        binding.textPlaces.setTextColor(Color.GREEN)
//        binding.buttonSbros.visibility = View.INVISIBLE

        fun remainingSeats() {
            binding.counter.text = counter.toString()
            if (counter == 0) {
                binding.textPlaces.text = "Все места свободны"
                binding.textPlaces.setTextColor(Color.GREEN)
                binding.buttonMinus.isEnabled = false
            } else {
                binding.buttonMinus.isEnabled = true
            }
            if (counter > 0 && counter < 50) {
                val remainingSets = 50 - counter
                binding.textPlaces.text = "Осталось мест $remainingSets"
                binding.textPlaces.setTextColor(Color.BLUE)
            }
            if (counter == 50) {
                binding.buttonSbros.visibility = View.VISIBLE
                binding.textPlaces.text = "Пассажиров слишком много!"
                binding.textPlaces.setTextColor(Color.RED)
            } else {
                binding.buttonSbros.visibility = View.INVISIBLE
            }
        }

        remainingSeats()

        //Кнопка +
        binding.buttonPlus.setOnClickListener {
            if (counter < 50) {
                counter++

            }
            remainingSeats()

        }

        //Кнопка -
        binding.buttonMinus.setOnClickListener {
            if (counter > 0) {
                counter--
            }
            remainingSeats()

        }

        //Кнопка Сброс
        binding.buttonSbros.setOnClickListener {
            counter = 0
            remainingSeats()
        }


    }

}