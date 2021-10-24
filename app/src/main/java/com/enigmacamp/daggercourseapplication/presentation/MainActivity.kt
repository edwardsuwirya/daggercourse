package com.enigmacamp.daggercourseapplication.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.enigmacamp.daggercourseapplication.R
import com.enigmacamp.daggercourseapplication.repository.model.Car
import com.enigmacamp.daggercourseapplication.repository.model.GasolineEngine

class MainActivity : AppCompatActivity() {
    private lateinit var myCar: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myCar = Car(GasolineEngine())
        myCar.run()
        myCar.parking()
    }
}