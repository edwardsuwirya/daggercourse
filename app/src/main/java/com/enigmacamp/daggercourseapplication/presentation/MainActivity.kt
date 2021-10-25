package com.enigmacamp.daggercourseapplication.presentation

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.enigmacamp.daggercourseapplication.R
import com.enigmacamp.daggercourseapplication.databinding.ActivityMainBinding
import com.enigmacamp.daggercourseapplication.di.DaggerVehicleComponent
import com.enigmacamp.daggercourseapplication.di.EngineModule
import com.enigmacamp.daggercourseapplication.repository.model.Car
import com.enigmacamp.daggercourseapplication.repository.model.Vehicle
import com.enigmacamp.daggercourseapplication.vehicleComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    @Inject
    lateinit var myNewCar: Vehicle

    @Inject
    lateinit var brands: List<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        vehicleComponent.inject(this)
        Log.d("CarDI", "onCreate-Main: $myNewCar")
        Log.d("CarDI", "onCreate-Main: $brands")

        with(binding) {
            nextButton.setOnClickListener {
                goToNext()
            }
            carSalesButton.setOnClickListener {
                goToSales()
            }
        }
    }

    private fun goToNext() {
        val intent = Intent(this, NextActivity::class.java)
        startActivity(intent)
    }

    private fun goToSales() {
        val intent = Intent(this, SalesActivity::class.java)
        startActivity(intent)
    }
}