package com.example.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.d(Activitylog,"onCreate")
    }

    override fun onStart(){
        super.onStart()
        Log.d(Activitylog,"onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(Activitylog,"onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(Activitylog,"onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(Activitylog,"onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(Activitylog,"onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(Activitylog,"onRestart")
    }
}