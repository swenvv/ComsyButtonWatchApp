package com.example.comsybutton
import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import com.example.comsybutton.databinding.ActivityMainBinding
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast


class MainActivity : Activity() {

    var count: Int = 0

    private lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




    }

    fun showText(view: android.view.View) {
       val textView = findViewById<TextView>(R.id.editText)
        count++
        textView.text = count.toString()
        textView.setTextColor(Color.parseColor("#f5425a"))
       Toast.makeText(this, "Button clicked",Toast.LENGTH_SHORT).show()

    }


}