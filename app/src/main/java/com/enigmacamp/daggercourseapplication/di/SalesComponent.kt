package com.enigmacamp.daggercourseapplication.di

import com.enigmacamp.daggercourseapplication.di.annotation.ActivityScope
import com.enigmacamp.daggercourseapplication.di.annotation.Margin
import com.enigmacamp.daggercourseapplication.presentation.SalesActivity
import dagger.BindsInstance
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [SalesModule::class])
interface SalesComponent {
    fun inject(salesActivity: SalesActivity)

    @Subcomponent.Factory
    interface Factory {
        fun create(@BindsInstance @Margin margin: Int): SalesComponent
    }
}