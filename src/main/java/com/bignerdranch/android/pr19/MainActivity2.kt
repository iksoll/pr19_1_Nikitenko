package com.bignerdranch.android.pr19

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pra19.Crimefragment

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_crime)
        val currentFr=supportFragmentManager.findFragmentById(R.id.fragment_container)
        if(currentFr==null){
            val fragment= Crimefragment()
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container,fragment)
                .commit()
        }
    }
}