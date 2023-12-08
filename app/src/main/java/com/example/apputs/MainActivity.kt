package com.example.apputs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.apputs.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var recyclerViewAdapter: ListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        val recyclerView = binding.recyclerView
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.layoutManager = layoutManager

        recyclerViewAdapter = ListAdapter(createCategories())
        recyclerView.adapter = recyclerViewAdapter
    }

    private fun createCategories(): List<Category> {
        val categories = mutableListOf<Category>()
        categories.add(Category(R.drawable.ellipse214, "Yoga"))
        categories.add(Category(R.drawable.ellipse215, "Gym"))
        categories.add(Category(R.drawable.ellipse216, "Cardio"))
        categories.add(Category(R.drawable.ellipse217, "Stretch"))
        categories.add(Category(R.drawable.ellipse214, "Full Body"))

        return categories
    }
}
