package com.enigmacamp.daggercourseapplication.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.enigmacamp.daggercourseapplication.R
import com.enigmacamp.daggercourseapplication.di.component.NextComponent
import com.enigmacamp.daggercourseapplication.repository.model.Vehicle
import com.enigmacamp.daggercourseapplication.vehicleComponent
import javax.inject.Inject

class NextActivity : AppCompatActivity() {
    lateinit var nextComponent: NextComponent

    @Inject
    lateinit var myNewCar: Vehicle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)
        nextComponent = vehicleComponent.nextComponent()
        nextComponent.inject(this)
        Log.d("CarDI", "onCreate-Next: $myNewCar")
    }
}