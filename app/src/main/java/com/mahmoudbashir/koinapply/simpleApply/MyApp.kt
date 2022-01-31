package com.mahmoudbashir.koinapply.simpleApply

import android.app.Application
import org.koin.core.context.startKoin


class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin { }
    }
}