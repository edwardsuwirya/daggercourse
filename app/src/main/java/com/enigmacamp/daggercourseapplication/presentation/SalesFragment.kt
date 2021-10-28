package com.enigmacamp.daggercourseapplication.presentation

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.enigmacamp.daggercourseapplication.R
import com.enigmacamp.daggercourseapplication.repository.model.CarSales
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class SalesFragment : Fragment() {
    @Inject
    lateinit var carSales: CarSales
    override fun onAttach(context: Context) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
        Log.d("CarDI", "onCreate-Sales: $carSales")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sales, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance() = SalesFragment()
    }
}