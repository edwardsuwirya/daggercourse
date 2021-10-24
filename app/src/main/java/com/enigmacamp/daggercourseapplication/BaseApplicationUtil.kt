package com.enigmacamp.daggercourseapplication

import android.app.Activity

fun Activity.baseApplication(): BaseApplication {
    return application as BaseApplication
}

val Activity.appContainer: AppContainer
    get() = baseApplication().appContainer