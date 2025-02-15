package com.example.todo

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.todo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.newBtn.setOnClickListener{
            NewTaskSheet().show(supportFragmentManager, "newTaskTag")
        }
        val title = intent.getStringExtra("TITLE")
        val desc = intent.getStringExtra("DESC")
        binding.TName.text = title
        binding.TDesc.text = desc
    }
}