package com.enigmacamp.daggercourseapplication

import android.app.Application
import com.enigmacamp.daggercourseapplication.di.component.DaggerVehicleComponent
import com.enigmacamp.daggercourseapplication.di.component.VehicleComponent

class BaseApplication : Application() {
    lateinit var vehicleComponent: VehicleComponent

    override fun onCreate() {
        super.onCreate()
        vehicleComponent = DaggerVehicleComponent.builder().engineCapacity(2000).build()
    }
}