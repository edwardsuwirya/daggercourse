package com.enigmacamp.daggercourseapplication.di

import com.enigmacamp.daggercourseapplication.repository.model.Engine
import com.enigmacamp.daggercourseapplication.repository.model.GasolineEngine
import dagger.Binds
import dagger.Module

@Module
abstract class EngineModule {
    @Binds
    abstract fun bindsGasolineEngine(gasolineEngine: GasolineEngine): Engine
}