package com.enigmacamp.daggercourseapplication.di.module

import com.enigmacamp.daggercourseapplication.repository.model.Car
import com.enigmacamp.daggercourseapplication.repository.model.Vehicle
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class VehicleModule {
    @Binds
    @Singleton
    abstract fun bindsCar(car: Car): Vehicle
}