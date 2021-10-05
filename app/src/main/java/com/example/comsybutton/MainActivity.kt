package com.example.comsybutton
import android.app.Activity
import android.os.Bundle
import com.example.comsybutton.databinding.ActivityMainBinding
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast


class MainActivity : Activity() {


    private lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.bt_openDoor)
        val textView = findViewById<TextView>(R.id.editText)

        var count: Int = 0;

        // Set a click listener for button widget
        button.setOnClickListener{
            count++
            //textView.text = "anders"

        }


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




    }



}