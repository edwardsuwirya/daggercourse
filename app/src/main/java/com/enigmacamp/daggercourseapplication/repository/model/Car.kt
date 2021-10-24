package com.enigmacamp.daggercourseapplication.repository.model

import android.util.Log
import com.enigmacamp.library.Wheels
import javax.inject.Inject

class Car @Inject constructor(private val engine: Engine, wheel: Wheels) {
    private val carWheels: String = wheel.assembleWheel()

    fun run() {
        Log.d("CarDI", "run: ${engine.startEngine()} with $carWheels")
    }

    fun parking() {
        Log.d("CarDI", "run: ${engine.stopEngine()}")
    }
}