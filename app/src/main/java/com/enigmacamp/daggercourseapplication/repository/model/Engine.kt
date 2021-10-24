package com.enigmacamp.daggercourseapplication.repository.model

interface Engine {
    val engineName: String
    fun startEngine(): String
    fun stopEngine(): String
}