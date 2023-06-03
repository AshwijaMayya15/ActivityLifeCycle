package com.example.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

val Activitylog = "State"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nextButton: Button = findViewById(R.id.nextActivity)
        nextButton.setOnClickListener(){
            startActivity(Intent(this,SecondActivity::class.java))
        }
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