package com.example.progressbar_and_floating_action

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var progressbar = findViewById<ProgressBar>(R.id.progressBar)
        var start= findViewById<Button>(R.id.start)
        var stop= findViewById<Button>(R.id.stop)
        var floatingactionbutton = findViewById<FloatingActionButton>(R.id.floatingActionButton)


        start.setOnClickListener {
            progressbar.visibility = View.VISIBLE
        }
        stop.setOnClickListener {
            progressbar.visibility = View.INVISIBLE
        }

        floatingactionbutton.setOnClickListener {
            Toast.makeText(applicationContext,"Floating Action Buttona tıkladınız!", Toast.LENGTH_LONG).show()
        }


    }
}