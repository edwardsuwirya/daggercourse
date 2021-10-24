package com.enigmacamp.daggercourseapplication.di

import com.enigmacamp.daggercourseapplication.di.annotation.DieselType
import com.enigmacamp.daggercourseapplication.di.annotation.GasolineType
import com.enigmacamp.daggercourseapplication.repository.model.DieselEngine
import com.enigmacamp.daggercourseapplication.repository.model.Engine
import com.enigmacamp.daggercourseapplication.repository.model.GasolineEngine
import dagger.Binds
import dagger.Module

@Module
abstract class EngineModule {
    @Binds
    @GasolineType
    abstract fun bindsGasolineEngine(gasolineEngine: GasolineEngine): Engine

    @Binds
    @DieselType
    abstract fun bindsDieselEngine(dieselEngine: DieselEngine): Engine
}