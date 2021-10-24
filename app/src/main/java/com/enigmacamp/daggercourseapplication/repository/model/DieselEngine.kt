package com.enigmacamp.daggercourseapplication.repository.model

import javax.inject.Inject

class DieselEngine @Inject constructor() : Engine {
    override val engineName = "Diesel Engine"

    override fun startEngine() = "$engineName Started"

    override fun stopEngine() = "$engineName Stop"
}