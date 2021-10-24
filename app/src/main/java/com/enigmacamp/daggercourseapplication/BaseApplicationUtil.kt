package com.enigmacamp.daggercourseapplication

import android.app.Activity

fun Activity.baseApplication(): BaseApplication {
    return application as BaseApplication
}