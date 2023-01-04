package com.enigmacamp.daggercourseapplication

import android.app.Activity
import com.enigmacamp.daggercourseapplication.di.component.VehicleComponent

fun Activity.baseApplication(): BaseApplication {
    return application as BaseApplication
}

val Activity.vehicleComponent: VehicleComponent
    get() {
        return baseApplication().vehicleComponent
    }