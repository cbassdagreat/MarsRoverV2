package cbassdagreat.github.marsroverv2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cbassdagreat.github.marsroverv2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}