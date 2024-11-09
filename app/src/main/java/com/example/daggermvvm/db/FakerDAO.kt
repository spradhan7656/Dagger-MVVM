package com.example.daggermvvm.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.daggermvvm.models.Products

@Dao
interface FakerDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)//if the primary key is duplicate then will replace
    suspend fun addProduct(products:List<Products>)

    @Query("SELECT * FROM Products")
    suspend fun getProduct():List<Products>
}