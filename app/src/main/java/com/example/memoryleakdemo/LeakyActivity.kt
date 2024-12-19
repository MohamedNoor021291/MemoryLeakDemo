package com.example.memoryleakdemo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class LeakyActivity : AppCompatActivity() {
    companion object{
        private var leakySingleton: LeakySingleton? = null
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leaky)

        // Memory leak: Static reference to the Activity context
        if (leakySingleton == null) {
            leakySingleton = LeakySingleton(this);
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        //Making reference to null will make the object ready garbage collection
        if(leakySingleton !== null){
            leakySingleton = null
            Log.d("leakySingleton","leakySingleton NOT NULL")
        }
    }

}