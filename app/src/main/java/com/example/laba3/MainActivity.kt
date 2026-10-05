package com.example.laba3


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editTextText)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {

            val intent = Intent(this@MainActivity, SecondActivity::class.java)

            intent.putExtra(
                "text2remember",
                editText.text.toString()
            )

            startActivity(intent)
        }
    }
}