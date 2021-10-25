package com.enigmacamp.daggercourseapplication

import android.app.Application
import com.enigmacamp.daggercourseapplication.di.DaggerBrandComponent
import com.enigmacamp.daggercourseapplication.di.DaggerVehicleComponent
import com.enigmacamp.daggercourseapplication.di.VehicleComponent

class BaseApplication : Application() {
    lateinit var vehicleComponent: VehicleComponent

    private fun provideDataComponent() = DaggerBrandComponent.create()

    override fun onCreate() {
        super.onCreate()

        vehicleComponent =
            DaggerVehicleComponent.builder().buildBrandComponent(provideDataComponent())
                .engineCapacity(2000).build()
    }
}