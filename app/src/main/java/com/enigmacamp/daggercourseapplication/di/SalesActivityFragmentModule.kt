package com.enigmacamp.daggercourseapplication.di

import com.enigmacamp.daggercourseapplication.presentation.SalesFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class SalesActivityFragmentModule {
    @ContributesAndroidInjector
    abstract fun contributeSalesFragment(): SalesFragment
}