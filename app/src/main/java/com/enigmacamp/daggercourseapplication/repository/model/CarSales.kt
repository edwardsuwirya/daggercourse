package com.enigmacamp.daggercourseapplication.repository.model

import javax.inject.Inject

class CarSales @Inject constructor(private val car: Vehicle) {
    fun saleCar() = "Sale a car with type : $car"
}