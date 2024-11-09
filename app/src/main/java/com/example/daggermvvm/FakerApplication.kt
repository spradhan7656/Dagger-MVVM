package com.example.daggermvvm

import android.app.Application
import com.example.daggermvvm.di.ApplicationComponent
import com.example.daggermvvm.di.DaggerApplicationComponent
import dagger.Component

class FakerApplication:Application() {

    lateinit var applicationComponent:ApplicationComponent
    override fun onCreate() {
        super.onCreate()
        applicationComponent=DaggerApplicationComponent.factory().create(this)
    }
}