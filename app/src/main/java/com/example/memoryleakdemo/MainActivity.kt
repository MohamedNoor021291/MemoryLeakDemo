package com.example.memoryleakdemo

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.openLeakyActivityButton).setOnClickListener {
            val intent = Intent(this@MainActivity, LeakyActivity::class.java)
            startActivity(intent)
        }
    }
}