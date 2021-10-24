package com.enigmacamp.daggercourseapplication.di

import com.enigmacamp.daggercourseapplication.repository.model.Car
import dagger.Component

@Component
interface VehicleComponent {
    fun car(): Car
}