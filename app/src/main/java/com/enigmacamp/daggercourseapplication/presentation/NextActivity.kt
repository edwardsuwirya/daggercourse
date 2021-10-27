package com.enigmacamp.daggercourseapplication.presentation

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.enigmacamp.daggercourseapplication.R
import com.enigmacamp.daggercourseapplication.repository.model.Vehicle
import dagger.android.AndroidInjection
import dagger.android.DaggerActivity
import javax.inject.Inject

class NextActivity : DaggerActivity() {
    @Inject
    lateinit var myNewCar: Vehicle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)
        Log.d("CarDI", "onCreate-Next: $myNewCar")
    }
}