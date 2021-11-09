package com.example.p071birdland

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val RadioGroup: RadioGroup = findViewById(R.id.Group)
        val Buttom1: RadioButton = findViewById(R.id.Buttom1)
        val Buttom2: RadioButton = findViewById(R.id.Buttom2)

    }
}