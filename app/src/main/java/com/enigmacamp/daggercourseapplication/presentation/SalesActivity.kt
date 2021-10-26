package com.enigmacamp.daggercourseapplication.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.enigmacamp.daggercourseapplication.R
import com.enigmacamp.daggercourseapplication.repository.model.CarSales
import dagger.android.AndroidInjection
import javax.inject.Inject

class SalesActivity : AppCompatActivity() {
    @Inject
    lateinit var carSales: CarSales

    @Inject
    lateinit var brands: List<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sales)
        val result = carSales.saleCar()
        Log.d("CarDI", "onCreate-Sales: $result")
        Log.d("CarDI", "onCreate-Sales: $brands")
    }
}