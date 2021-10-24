package com.enigmacamp.daggercourseapplication.repository.model

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(private val engine: Engine) {
    fun run() {
        Log.d("CarDI", "run: ${engine.startEngine()}")
    }

    fun parking() {
        Log.d("CarDI", "run: ${engine.stopEngine()}")
    }
}