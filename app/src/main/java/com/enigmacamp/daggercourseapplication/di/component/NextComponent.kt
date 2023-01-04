package com.enigmacamp.daggercourseapplication.di.component

import com.enigmacamp.daggercourseapplication.di.annotation.ActivityScope
import com.enigmacamp.daggercourseapplication.presentation.NextActivity
import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface NextComponent {
    fun inject(nextActivity: NextActivity)
}