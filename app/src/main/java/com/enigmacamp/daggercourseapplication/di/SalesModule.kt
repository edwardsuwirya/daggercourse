package com.enigmacamp.daggercourseapplication.di

import com.enigmacamp.daggercourseapplication.di.annotation.ActivityScope
import com.enigmacamp.daggercourseapplication.repository.model.CarSales
import com.enigmacamp.daggercourseapplication.repository.model.Vehicle
import dagger.Module
import dagger.Provides

@Module
class SalesModule {
    @Provides
    @ActivityScope
    fun providesCarSales(car: Vehicle): CarSales = CarSales(car)
}
/**
 Bisa juga tanpa module, tinggal tambahkan @Inject di CarSales constructor, dan hilangkan property modules
 di @subcomponent

 Bisa menggunakan binds, tinggal tambahkan @Inject di CarSales constructor
 Constructor Injection Car di dapat dari parent nya

 Kedua opsi diatas bisa karena kita mendaftarkan class CarSales ke Dagger, bukan sebuah interface

*/

//@Module
//abstract class SalesModule {
//    @Binds
//    @ActivityScope
//    abstract fun bindsCarsSales(carSales: CarSales): CarSales
//}