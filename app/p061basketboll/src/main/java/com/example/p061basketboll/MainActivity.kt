package com.example.p061basketboll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Text1: TextView = findViewById(R.id.zero2)
        val Text2: TextView = findViewById(R.id.zero)
        var Number = 0
        var Number1 = 0

        val PointOneButton: Button = findViewById(R.id.button)
        val PointTwoButton: Button = findViewById(R.id.button2)
        val PointTreeButton: Button = findViewById(R.id.button3)

        val PointOneButton2: Button = findViewById(R.id.button11)
        val PointTwoButton2: Button = findViewById(R.id.button12)
        val PointTreeButton2: Button = findViewById(R.id.button13)

        val Reset: Button = findViewById(R.id.Reset)

        PointOneButton.setOnClickListener{
            Number = Number + 1
            Text1.text=Number.toString()
            Reset.setEnabled(true)
        }
        PointTwoButton.setOnClickListener{
            Number = Number + 2
            Text1.text=Number.toString()
            Reset.setEnabled(true)
        }
        PointTreeButton.setOnClickListener{
            Number = Number + 3
            Text1.text=Number.toString()
            Reset.setEnabled(true)
        }

        PointOneButton2.setOnClickListener{
            Number1 = Number1 + 1
            Text2.text=Number1.toString()
            Reset.setEnabled(true)
        }
        PointTwoButton2.setOnClickListener{
            Number1 = Number1 + 2
            Text2.text=Number1.toString()
            Reset.setEnabled(true)
        }
        PointTreeButton2.setOnClickListener{
            Number1 = Number1 + 3
            Text2.text=Number1.toString()
            Reset.setEnabled(true)
        }
Reset.setEnabled(false)

        Reset.setOnClickListener{
            Number = 0
            Number1 = 0
            Reset.setEnabled(false)
            Text2.text=Number.toString()
            Text1.text=Number.toString()

        }

    }
}