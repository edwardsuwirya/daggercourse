package com.enigmacamp.daggercourseapplication.di

import com.enigmacamp.daggercourseapplication.di.annotation.ActivityScope
import com.enigmacamp.daggercourseapplication.presentation.SalesActivity
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [SalesModule::class])
interface SalesComponent {
    fun inject(salesActivity: SalesActivity)
}