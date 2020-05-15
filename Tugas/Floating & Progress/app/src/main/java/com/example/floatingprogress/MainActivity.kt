package com.example.floatingprogress

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        floating.setOnClickListener{
            val inten = Intent(this, Floating::class.java)
            startActivity(inten)
        }

        progress.setOnClickListener{
            val inten = Intent(this, Progress::class.java)
            startActivity(inten)
        }
    }
}
