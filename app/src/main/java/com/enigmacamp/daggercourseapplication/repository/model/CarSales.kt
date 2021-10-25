package com.enigmacamp.daggercourseapplication.repository.model

class CarSales(private val margin: Int, private val car: Vehicle) {
    fun saleCar() = "Sale a car with type : $car with margin : $margin"
}