package com.enigmacamp.daggercourseapplication.presentation

import android.os.Bundle
import android.util.Log
import com.enigmacamp.daggercourseapplication.R
import com.enigmacamp.daggercourseapplication.repository.model.CarSales
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class SalesActivity : DaggerAppCompatActivity() {
    @Inject
    lateinit var carSales: CarSales

    @Inject
    lateinit var brands: List<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sales)
        val result = carSales.saleCar()
        Log.d("CarDI", "onCreate-Sales: $carSales")
        Log.d("CarDI", "onCreate-Sales: $brands")
    }
}