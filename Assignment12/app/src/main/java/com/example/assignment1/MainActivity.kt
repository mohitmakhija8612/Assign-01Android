package com.example.assignment1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val display: TextView = findViewById(R.id.display)

        val buttons = listOf(
            R.id.button_clear, R.id.button_plus_minus, R.id.button_percentage, R.id.button_divide,
            R.id.button_7, R.id.button_8, R.id.button_9, R.id.button_multiply,
            R.id.button_4, R.id.button_5, R.id.button_6, R.id.button_minus,
            R.id.button_1, R.id.button_2, R.id.button_3, R.id.button_plus,
            R.id.button_0, R.id.button_dot, R.id.button_equals
        )

        val buttonText = buttons.associateWith { findViewById<Button>(it).text.toString() }

        buttons.forEach { id ->
            findViewById<Button>(id).setOnClickListener {
                display.text = buttonText[id]
            }
        }
    }
}
