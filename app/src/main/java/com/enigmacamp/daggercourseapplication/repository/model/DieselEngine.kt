package com.enigmacamp.daggercourseapplication.repository.model

import javax.inject.Inject

class DieselEngine @Inject constructor(engineCapacity: Int) : Engine {
    override val engineName = "Diesel Engine $engineCapacity cc"

    override fun startEngine() = "$engineName Started"

    override fun stopEngine() = "$engineName Stop"
}