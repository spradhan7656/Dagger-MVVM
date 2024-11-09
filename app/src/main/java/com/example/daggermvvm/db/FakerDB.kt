package com.example.daggermvvm.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.daggermvvm.models.Products
import com.example.daggermvvm.models.Rating

@Database(entities = [Products::class], version = 2)
abstract class FakerDB:RoomDatabase() {

    abstract fun getFakerDAO():FakerDAO
}