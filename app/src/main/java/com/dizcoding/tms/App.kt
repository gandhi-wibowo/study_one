package com.dizcoding.tms

import app.beelabs.com.codebase.base.BaseApp
import app.beelabs.com.codebase.di.component.AppComponent
import app.beelabs.com.codebase.di.component.DaggerAppComponent
import com.jakewharton.threetenabp.AndroidThreeTen


class App : BaseApp() {
    companion object {
        val appComponent: AppComponent
            get() = getComponent()
    }


    override fun onCreate() {
        super.onCreate()
        setupBuilder(DaggerAppComponent.builder(), this)
        setupDefaultFont("fonts/WorkSans-Regular.ttf")
        AndroidThreeTen.init(this)
    }

}