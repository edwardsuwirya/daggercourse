package com.enigmacamp.daggercourseapplication

import android.app.Application
import com.enigmacamp.daggercourseapplication.di.DaggerBrandComponent
import com.enigmacamp.daggercourseapplication.di.DaggerVehicleComponent
import com.enigmacamp.daggercourseapplication.di.VehicleComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class BaseApplication : Application(), HasAndroidInjector {
    @Inject
    lateinit var dispatchAndroidInjector: DispatchingAndroidInjector<Any>

    private fun provideDataComponent() = DaggerBrandComponent.create()

    private val vehicleComponent: VehicleComponent by lazy {
        DaggerVehicleComponent.builder().buildBrandComponent(provideDataComponent())
            .engineCapacity(2000).margin(10).build()
    }

    override fun onCreate() {
        super.onCreate()
        vehicleComponent.inject(this)
    }

    override fun androidInjector(): AndroidInjector<Any> = dispatchAndroidInjector
}