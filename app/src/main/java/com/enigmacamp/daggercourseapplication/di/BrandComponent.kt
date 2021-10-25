package com.enigmacamp.daggercourseapplication.di

import dagger.Component

@Component(modules = [BrandModule::class])
interface BrandComponent {
    fun provideListBrand(): List<String>
}
