package com.example.exam5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.exam5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var outerRecycler:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        val viewModel: viewModel by viewModels()
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        outerRecycler = binding.RVOuter
        outerRecycler.layoutManager = LinearLayoutManager(this)
        outerRecycler.adapter = OuterAdapter(viewModel.parsedJson)

    }
}