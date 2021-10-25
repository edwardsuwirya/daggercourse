package com.enigmacamp.daggercourseapplication.di

import dagger.Module
import dagger.Provides

@Module
class BrandModule {
    @Provides
    fun provideCarBrand(): List<String> = arrayListOf("Honda", "Nissan")
}