package io.github.ykws.example.danger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import io.github.ykws.example.danger.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel = ViewModelProvider(this).get(CounterViewModel::class.java)
        viewModel.counter.observe(this) { binding.counter.text = it.toString() }

        binding.button.setOnClickListener { viewModel.count() }
    }
}
