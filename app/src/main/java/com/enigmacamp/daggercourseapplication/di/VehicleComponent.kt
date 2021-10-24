package com.enigmacamp.daggercourseapplication.di

import com.enigmacamp.daggercourseapplication.presentation.MainActivity
import dagger.Component

@Component(modules = [VehicleModule::class, EngineModule::class, WheelModule::class])
interface VehicleComponent {
    fun inject(mainActivity: MainActivity)
}