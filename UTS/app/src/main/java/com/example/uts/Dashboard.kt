package com.example.uts

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_dashboard.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.system.exitProcess


class Dashboard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        gotoTampil.setOnClickListener {
            val inten = Intent(this, Tampil::class.java)
            startActivity(inten)
        }

        gotoInput.setOnClickListener {
            val inten = Intent(this, Input::class.java)
            startActivity(inten)
        }

        gotoLogout.setOnClickListener {
            exitProcess(0)

        }
    }
}
