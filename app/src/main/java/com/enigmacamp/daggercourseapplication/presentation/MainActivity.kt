package com.enigmacamp.daggercourseapplication.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.enigmacamp.daggercourseapplication.R
import com.enigmacamp.daggercourseapplication.di.DaggerVehicleComponent
import com.enigmacamp.daggercourseapplication.repository.model.Car
import com.enigmacamp.daggercourseapplication.repository.model.Vehicle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var myNewCar: Vehicle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerVehicleComponent.create().inject(this)
        myNewCar.run()
        myNewCar.parking()
    }
}