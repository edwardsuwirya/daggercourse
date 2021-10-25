package com.enigmacamp.daggercourseapplication.di

import com.enigmacamp.daggercourseapplication.di.annotation.ActivityScope
import com.enigmacamp.daggercourseapplication.repository.model.CarSales
import com.enigmacamp.daggercourseapplication.repository.model.Vehicle
import dagger.Module
import dagger.Provides

@Module
class SalesModule {
    @Provides
    @ActivityScope
    fun providesCarSales(car: Vehicle): CarSales = CarSales(car)
}