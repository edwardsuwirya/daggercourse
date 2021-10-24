package com.enigmacamp.daggercourseapplication.repository.model

class DieselEngine : Engine {
    override val engineName = "Diesel Engine"

    override fun startEngine() = "$engineName Started"

    override fun stopEngine() = "$engineName Stop"
}