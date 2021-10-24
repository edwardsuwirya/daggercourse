package com.enigmacamp.daggercourseapplication.di

import com.enigmacamp.daggercourseapplication.repository.model.Car
import com.enigmacamp.daggercourseapplication.repository.model.Vehicle
import dagger.Binds
import dagger.Module

@Module
abstract class VehicleModule {
    @Binds
    abstract fun bindsCar(car: Car): Vehicle
}