package com.example.myapplication

import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    var counter = 0
    var choiceCount = 0
    val scope = CoroutineScope(Dispatchers.Default)
    var stopTimer = false

    override fun onCreate(savedInstanceState: Bundle?) = runBlocking {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fun updateProgressBar() {
            binding.progressBar.progress = counter
            binding.textView.text = counter.toString()
        }

        binding.seekBar2.max = 120
        binding.progressBar.max = 120


        binding.seekBar2.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(
                seekBar: SeekBar?,
                progress: Int,
                fromUser: Boolean
            ) {
                choiceCount = progress
                binding.textView3.text = choiceCount.toString()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}

        })

        fun auto_update(count: Long) {
            val time = count * 1000
            object : CountDownTimer(time, 1000) {
                //Запускаем первый таймер для выполнения запроса sid
                override fun onTick(millisUntilFinished: Long) {
                    if (stopTimer == false) {
                        updateProgressBar()
                        binding.textTimer.text = "Таймер запущен!"
                    } else {
                        cancel()
                    }

                }

                override fun onFinish() {
                    if (stopTimer == false) {
                        binding.textTimer.text = "Таймер завершен!"
                        binding.textView.text = "0"
                        binding.buttonStart.isEnabled = true
                    }

                }
            }.start()
        }

        binding.buttonStart.setOnClickListener {
            auto_update(choiceCount.toLong())
            counter = choiceCount
            binding.buttonStart.isEnabled = false
            stopTimer = false

            scope.launch {
                while (counter > 0) {
                    delay(1000)
                    counter--
                    if (stopTimer == true) {
                        cancel()
                    }
                }
            }
        }

        binding.buttonStop.setOnClickListener {
            stopTimer = true
            counter = 0
            updateProgressBar()
            binding.buttonStart.isEnabled = true
            binding.textTimer.text = "Таймер остановлен!"

        }

    }


}