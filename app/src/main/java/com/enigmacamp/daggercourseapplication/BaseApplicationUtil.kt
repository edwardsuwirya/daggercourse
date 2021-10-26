package com.enigmacamp.daggercourseapplication

import android.app.Activity
import com.enigmacamp.daggercourseapplication.di.VehicleComponent

fun Activity.baseApplication(): BaseApplication {
    return application as BaseApplication
}