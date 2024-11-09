package com.example.daggermvvm.repositorys

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.daggermvvm.db.FakerDB
import com.example.daggermvvm.models.Products
import com.example.daggermvvm.retrofit.FakerAPI
import javax.inject.Inject

class ProductRepository @Inject constructor(private val fakerAPI: FakerAPI,private val fakerDB: FakerDB) {

    private val _products=MutableLiveData<List<Products>>()
    val products : LiveData<List<Products>>
        get() =_products

    suspend fun getProduct(){
        val result=fakerAPI.getProducts()
        if(result.isSuccessful && result.body()!=null){
            fakerDB.getFakerDAO().addProduct(result.body()!!)
            _products.postValue(result.body())
        }
    }
}