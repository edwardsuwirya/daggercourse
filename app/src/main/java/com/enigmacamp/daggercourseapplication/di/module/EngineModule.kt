package com.enigmacamp.daggercourseapplication.di.module

import com.enigmacamp.daggercourseapplication.di.annotation.DieselType
import com.enigmacamp.daggercourseapplication.di.annotation.GasolineType
import com.enigmacamp.daggercourseapplication.repository.model.DieselEngine
import com.enigmacamp.daggercourseapplication.repository.model.Engine
import com.enigmacamp.daggercourseapplication.repository.model.GasolineEngine
import dagger.Module
import dagger.Provides

@Module
class EngineModule {
    @Provides
    @GasolineType
    fun providesGasolineEngine(capacity: Int): Engine = GasolineEngine(capacity)

    @Provides
    @DieselType
    fun providesDieselEngine(capacity: Int): Engine = DieselEngine(capacity)
}