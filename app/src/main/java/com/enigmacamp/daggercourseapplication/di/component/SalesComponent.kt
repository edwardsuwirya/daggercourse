package com.enigmacamp.daggercourseapplication.di.component

import com.enigmacamp.daggercourseapplication.di.module.SalesModule
import com.enigmacamp.daggercourseapplication.di.annotation.ActivityScope
import com.enigmacamp.daggercourseapplication.presentation.SalesActivity
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [SalesModule::class])
//@Subcomponent
interface SalesComponent {
    fun inject(salesActivity: SalesActivity)
}