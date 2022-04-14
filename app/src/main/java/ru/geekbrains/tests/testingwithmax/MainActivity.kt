package ru.geekbrains.tests.testingwithmax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {
            // some action
        }
    }

    val btn = findViewById<Button>(R.id.view_btn)

    val someInt = 1

}