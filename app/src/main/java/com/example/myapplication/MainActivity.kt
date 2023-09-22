package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //
        findViewById<Button>(R.id.PrzyciskKot)
        findViewById<ImageView>(R.id.Kot).setImageResource(
            R.drawable.pobrane
        )

        }
    }
}