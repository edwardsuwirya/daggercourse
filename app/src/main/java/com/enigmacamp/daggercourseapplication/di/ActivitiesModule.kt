package com.enigmacamp.daggercourseapplication.di

import com.enigmacamp.daggercourseapplication.di.annotation.ActivityScope
import com.enigmacamp.daggercourseapplication.presentation.MainActivity
import com.enigmacamp.daggercourseapplication.presentation.NextActivity
import com.enigmacamp.daggercourseapplication.presentation.SalesActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivitiesModule {
    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity

    @ContributesAndroidInjector
    abstract fun contributeNextActivity(): NextActivity

    @ContributesAndroidInjector(modules = [SalesModule::class, SalesActivityFragmentModule::class])
    @ActivityScope
    abstract fun contributeSalesActivity(): SalesActivity
}