package com.example.recyclerkotlin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.system.exitProcess

const val ip = "192.168.1.4"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gotoJadwal.setOnClickListener{
            val inten = Intent(this, Jadwal::class.java)
            startActivity(inten)
        }

        gotoIdentitas.setOnClickListener{
            val inten = Intent(this, Identitas::class.java)
            startActivity(inten)
        }

        gotoMarquee.setOnClickListener{
            val inten = Intent(this, Marquee::class.java)
            startActivity(inten)
        }

        gotoPengumuman.setOnClickListener{
            val inten = Intent(this, Pengumuman::class.java)
            startActivity(inten)
        }

        gotoSlideshow.setOnClickListener{
            val inten = Intent(this, SlideShow::class.java)
            startActivity(inten)
        }

        gotoTagline.setOnClickListener{
            val inten = Intent(this, Tagline::class.java)
            startActivity(inten)
        }

        goExit.setOnClickListener {
            exitProcess(0)
        }
    }
}
