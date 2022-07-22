package com.example.aswitch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aswitch.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        binding.switch1.setOnCheckedChangeListener { compoundButton, onSwitch ->
            if (onSwitch)
                binding.imageView.setImageResource(R.drawable.bombilla_on_copia)
            else
            binding.imageView.setImageResource(R.drawable.bombilla_off_copia)

        }
    }
}