package ru.geekbrains.tests.testingwithmax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    /** Задание переменных */ //region
    val btn = findViewById<Button>(R.id.view_btn)
    val someInt = 1000
    val someText = "Hello World and All People!"
    //endregion


    val someSomesome = "some"
    // Инициализация переменной должна быть раньше её использования
    val btn = findViewById<Button>(R.id.view_btn)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {
            // some action
        }
        Toast.makeText(this, "Hello, Maks. You are best!", Toast.LENGTH_SHORT).show()
    }

}