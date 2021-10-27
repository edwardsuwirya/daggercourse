package com.enigmacamp.daggercourseapplication

import com.enigmacamp.daggercourseapplication.di.DaggerBrandComponent
import com.enigmacamp.daggercourseapplication.di.DaggerVehicleComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class BaseApplication : DaggerApplication() {
    private fun provideDataComponent() = DaggerBrandComponent.create()

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> =
        DaggerVehicleComponent.builder().buildBrandComponent(provideDataComponent())
            .engineCapacity(2000).margin(10).build()

}