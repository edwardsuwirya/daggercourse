package com.enigmacamp.daggercourseapplication

import android.app.Application

class BaseApplication : Application() {
    val appContainer = AppContainer()
}