package com.example.floatingprogress

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_floating.*

class Floating : AppCompatActivity() {

    var isOpen = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_floating)

        val fabOpen = AnimationUtils.loadAnimation(this, R.anim.fab_open)
        val fabClose = AnimationUtils.loadAnimation(this, R.anim.fab_close)
        val fabRClockwise = AnimationUtils.loadAnimation(this, R.anim.rotate_anticlockwise)
        val fabAntiClockwise = AnimationUtils.loadAnimation(this, R.anim.rotate_anticlockwise)

        addbutton.setOnClickListener{

            if (isOpen) {

                editbutton.startAnimation(fabClose)
                savebutton.startAnimation(fabClose)
                deletebutton.startAnimation(fabClose)
                addbutton.startAnimation(fabRClockwise)

                isOpen = false
            }

            else {

                editbutton.startAnimation(fabOpen)
                savebutton.startAnimation(fabOpen)
                deletebutton.startAnimation(fabOpen)
                addbutton.startAnimation(fabAntiClockwise)

                editbutton.isClickable
                savebutton.isClickable
                deletebutton.isClickable

                isOpen = true
            }

            editbutton.setOnClickListener{
                Toast.makeText(this,"You click on edit button", Toast.LENGTH_LONG).show()
            }

            savebutton.setOnClickListener{
                Toast.makeText(this,"You click on save button", Toast.LENGTH_LONG).show()
            }

            deletebutton.setOnClickListener{
                Toast.makeText(this,"You click on delete button", Toast.LENGTH_LONG).show()
            }

        }
    }
}
