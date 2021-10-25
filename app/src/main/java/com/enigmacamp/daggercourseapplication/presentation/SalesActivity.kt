package com.enigmacamp.daggercourseapplication.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.enigmacamp.daggercourseapplication.R
import com.enigmacamp.daggercourseapplication.di.SalesComponent
import com.enigmacamp.daggercourseapplication.repository.model.CarSales
import com.enigmacamp.daggercourseapplication.vehicleComponent
import javax.inject.Inject

class SalesActivity : AppCompatActivity() {
    lateinit var salesComponent: SalesComponent

    @Inject
    lateinit var carSales: CarSales

    @Inject
    lateinit var brands: List<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sales)
        salesComponent = vehicleComponent.salesComponentFactory().create(10)
        salesComponent.inject(this)
        val result = carSales.saleCar()
        Log.d("CarDI", "onCreate-Sales: $result")
        Log.d("CarDI", "onCreate-Sales: $brands")
    }
}