package com.example.multiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mylibrary.TestDataClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val instance = TestDataClass()
    }
}