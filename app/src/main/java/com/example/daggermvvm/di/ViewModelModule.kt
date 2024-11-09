package com.example.daggermvvm.di

import androidx.lifecycle.ViewModel
import com.example.daggermvvm.viewmodels.MainViewModel
import com.example.daggermvvm.viewmodels.MainViewModel2
import dagger.Binds
import dagger.Module
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey
import javax.inject.Inject

@Module
abstract class ViewModelModule {

    //Use the mutlibindng feature
    @Binds
//    @StringKey("mainViewModel") //means to find easy just like qualifier
    @ClassKey(MainViewModel::class)
    @IntoMap //add a map
    abstract fun mainViewModel(mainViewModel: MainViewModel):ViewModel

    @Binds
//    @StringKey("mainViewModel2") //means to find easy just like qualifier
    @ClassKey(MainViewModel2::class)
    @IntoMap
    abstract fun mainViewModel2(mainViewModel2: MainViewModel2):ViewModel
}