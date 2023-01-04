package com.enigmacamp.daggercourseapplication.di.component

import com.enigmacamp.daggercourseapplication.di.module.EngineModule
import com.enigmacamp.daggercourseapplication.di.module.VehicleModule
import com.enigmacamp.daggercourseapplication.di.module.WheelModule
import com.enigmacamp.daggercourseapplication.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Component(modules = [VehicleModule::class, EngineModule::class, WheelModule::class])
@Singleton
interface VehicleComponent {
    fun inject(mainActivity: MainActivity)
    fun nextComponent(): NextComponent
    fun salesComponent(): SalesComponent

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun engineCapacity(capacity: Int): Builder
        fun build(): VehicleComponent
    }
}