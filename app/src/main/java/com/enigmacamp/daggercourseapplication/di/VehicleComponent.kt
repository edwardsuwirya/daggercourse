package com.enigmacamp.daggercourseapplication.di

import com.enigmacamp.daggercourseapplication.repository.model.Car
import dagger.Component

@Component(modules = [EngineModule::class])
interface VehicleComponent {
    fun car(): Car
}