package com.enigmacamp.daggercourseapplication.repository.model

import android.util.Log

class Car(private val engine: GasolineEngine) {
    fun run() {
        Log.d("CarDI", "run: ${engine.startEngine()}")
    }

    fun parking() {
        Log.d("CarDI", "run: ${engine.stopEngine()}")
    }
}