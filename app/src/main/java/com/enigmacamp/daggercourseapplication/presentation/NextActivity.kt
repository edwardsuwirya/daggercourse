package com.enigmacamp.daggercourseapplication.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.enigmacamp.daggercourseapplication.R
import com.enigmacamp.daggercourseapplication.di.DaggerVehicleComponent
import com.enigmacamp.daggercourseapplication.repository.model.Vehicle
import javax.inject.Inject

class NextActivity : AppCompatActivity() {
    @Inject
    lateinit var myNewCar: Vehicle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)
        DaggerVehicleComponent.builder().engineCapacity(2000).build().inject(this)
        Log.d("CarDI", "onCreate-Next: $myNewCar")
    }
}