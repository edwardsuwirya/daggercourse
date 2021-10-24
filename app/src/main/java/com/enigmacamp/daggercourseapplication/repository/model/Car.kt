package com.enigmacamp.daggercourseapplication.repository.model

import android.util.Log
import com.enigmacamp.daggercourseapplication.di.annotation.DieselType
import com.enigmacamp.library.Wheels
import javax.inject.Inject
import javax.inject.Named

class Car @Inject constructor(@DieselType private val engine: Engine, wheel: Wheels) : Vehicle {
    private val carWheels: String = wheel.assembleWheel()

    override fun run() {
        Log.d("CarDI", "run: ${engine.startEngine()} with $carWheels")
    }

    override fun parking() {
        Log.d("CarDI", "run: ${engine.stopEngine()}")
    }
}