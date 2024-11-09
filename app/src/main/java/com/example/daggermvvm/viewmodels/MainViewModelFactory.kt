package com.example.daggermvvm.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.daggermvvm.repositorys.ProductRepository
import javax.inject.Inject


// for single binding
//class MainViewModelFactory @Inject constructor(private val mainViewModel: MainViewModel):ViewModelProvider.Factory {
//
//    override fun <T : ViewModel> create(modelClass: Class<T>): T {
//        return mainViewModel as T
//
//    }
//}


// for multibinding
class MainViewModelFactory @Inject constructor(
    private val map: Map<Class<*>,@JvmSuppressWildcards ViewModel>
):ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return map[modelClass] as T

    }
}