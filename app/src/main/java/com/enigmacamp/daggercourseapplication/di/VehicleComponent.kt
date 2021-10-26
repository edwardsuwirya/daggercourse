package com.enigmacamp.daggercourseapplication.di

import com.enigmacamp.daggercourseapplication.BaseApplication
import com.enigmacamp.daggercourseapplication.di.annotation.Margin
import com.enigmacamp.daggercourseapplication.presentation.MainActivity
import com.enigmacamp.daggercourseapplication.presentation.NextActivity
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Component(
    modules = [AndroidInjectionModule::class, ActivitiesModule::class, VehicleModule::class, EngineModule::class, WheelModule::class],
    dependencies = [BrandComponent::class]
)
@Singleton
interface VehicleComponent {
    fun inject(application: BaseApplication)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun engineCapacity(capacity: Int): Builder
        fun margin(@BindsInstance @Margin margin: Int): Builder
        fun buildBrandComponent(brandComponent: BrandComponent): Builder
        fun build(): VehicleComponent
    }
}