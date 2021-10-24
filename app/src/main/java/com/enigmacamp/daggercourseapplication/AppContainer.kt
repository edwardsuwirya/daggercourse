package com.enigmacamp.daggercourseapplication

import com.enigmacamp.daggercourseapplication.repository.model.Car
import com.enigmacamp.daggercourseapplication.repository.model.GasolineEngine

class AppContainer {
    private val gasolineEngine = GasolineEngine()
    val myCar = Car(gasolineEngine)
}