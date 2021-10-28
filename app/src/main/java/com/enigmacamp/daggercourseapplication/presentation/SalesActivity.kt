package com.enigmacamp.daggercourseapplication.presentation

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.enigmacamp.daggercourseapplication.R
import com.enigmacamp.daggercourseapplication.repository.model.CarSales
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class SalesActivity : AppCompatActivity(),HasAndroidInjector {
    @Inject
    lateinit var dispatchAndroidInjector: DispatchingAndroidInjector<Any>

    @Inject
    lateinit var carSales: CarSales

    @Inject
    lateinit var brands: List<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sales)
        val result = carSales.saleCar()
        Log.d("CarDI", "onCreate-Sales: $carSales")
        Log.d("CarDI", "onCreate-Sales: $brands")
    }

    override fun androidInjector(): AndroidInjector<Any> = dispatchAndroidInjector
}