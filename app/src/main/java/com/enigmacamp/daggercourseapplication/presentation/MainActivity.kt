package com.enigmacamp.daggercourseapplication.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.enigmacamp.daggercourseapplication.R
import com.enigmacamp.daggercourseapplication.appContainer
import com.enigmacamp.daggercourseapplication.repository.model.Car

class MainActivity : AppCompatActivity() {
    private lateinit var myCar: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myCar = appContainer.myCar
        myCar.run()
        myCar.parking()
    }
}