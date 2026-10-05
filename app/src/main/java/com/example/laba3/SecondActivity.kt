package com.example.laba3



import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textView = findViewById<TextView>(R.id.textView3)
        val button = findViewById<Button>(R.id.button2)

        textView.text = intent.getStringExtra("text2remember")

        button.setOnClickListener {
            finish()
        }
    }
}