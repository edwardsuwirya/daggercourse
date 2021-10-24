package com.enigmacamp.daggercourseapplication.repository.model

import javax.inject.Inject

class GasolineEngine @Inject constructor(engineCapacity: Int) : Engine {
    override val engineName = "Gasoline Engine $engineCapacity cc"

    override fun startEngine() = "$engineName Started"

    override fun stopEngine() = "$engineName Stop"
}