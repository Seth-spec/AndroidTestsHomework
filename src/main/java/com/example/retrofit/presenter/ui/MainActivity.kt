package com.example.retrofit.presenter.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.retrofit.databinding.ActivityMainBinding
import com.example.retrofit.presenter.model.UserModel
import com.example.retrofit.presenter.view_model.CarViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val viewModel: CarViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.register.setOnClickListener {
            lifecycleScope.launch {
                viewModel.register(
                    UserModel(
                        "32434243",
                        "test111",
                        "test1231@gmail.com",
                        "gaga",
                        "lomidze",
                        "admin"
                    )
                )
            }
        }

        binding.getButton.setOnClickListener {
            lifecycleScope.launch {
                viewModel.getCarById()
            }
        }
    }
}