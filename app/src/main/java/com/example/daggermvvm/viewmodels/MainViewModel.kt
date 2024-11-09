package com.example.daggermvvm.viewmodels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.daggermvvm.models.Products
import com.example.daggermvvm.repositorys.ProductRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor (
    private val repository: ProductRepository,
    private  val randomize: Randomize
):ViewModel() {

    val productsLiveData:LiveData<List<Products>>
        get() = repository.products
    init {
        viewModelScope.launch {
            repository.getProduct()
        }
    }
}
class Randomize @Inject constructor(){
    fun doAction(){
        Log.d("DoAction","Random Action");
    }
}