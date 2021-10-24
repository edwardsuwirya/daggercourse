package com.enigmacamp.daggercourseapplication.di

import com.enigmacamp.library.RubberWheelImpl
import com.enigmacamp.library.Wheels
import dagger.Module
import dagger.Provides

@Module
class WheelModule {
    @Provides
    fun provideWheel(): Wheels {
        val rubberWheel = RubberWheelImpl()
        rubberWheel.wheelCount = 4
        return rubberWheel
    }
}