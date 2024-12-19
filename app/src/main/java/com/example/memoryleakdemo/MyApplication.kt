package com.example.memoryleakdemo

import android.app.Application
import leakcanary.LeakCanary
import leakcanary.LeakCanaryProcess
import shark.LeakTraceObject

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

    }
}