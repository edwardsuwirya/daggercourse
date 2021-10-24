package com.enigmacamp.daggercourseapplication.di

import com.enigmacamp.daggercourseapplication.di.annotation.DieselType
import com.enigmacamp.daggercourseapplication.di.annotation.GasolineType
import com.enigmacamp.daggercourseapplication.repository.model.DieselEngine
import com.enigmacamp.daggercourseapplication.repository.model.Engine
import com.enigmacamp.daggercourseapplication.repository.model.GasolineEngine
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class EngineModule constructor(private val capacity: Int) {
    @Provides
    @GasolineType
    fun providesGasolineEngine(): Engine = GasolineEngine(capacity)

    @Provides
    @DieselType
    fun providesDieselEngine(): Engine = DieselEngine(capacity)
}