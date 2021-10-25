package com.enigmacamp.daggercourseapplication.di

import com.enigmacamp.daggercourseapplication.presentation.MainActivity
import com.enigmacamp.daggercourseapplication.presentation.NextActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Component(modules = [VehicleModule::class, EngineModule::class, WheelModule::class])
@Singleton
interface VehicleComponent {
    fun inject(mainActivity: MainActivity)
    fun inject(nextActivity: NextActivity)

    fun salesComponentFactory(): SalesComponent.Factory

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun engineCapacity(capacity: Int): Builder
        fun build(): VehicleComponent
    }
}