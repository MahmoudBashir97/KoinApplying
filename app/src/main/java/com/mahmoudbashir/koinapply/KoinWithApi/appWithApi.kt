package com.mahmoudbashir.koinapply.KoinWithApi

import android.app.Application
import com.mahmoudbashir.koinapply.KoinWithApi.koinDi.apiModule
import com.mahmoudbashir.koinapply.KoinWithApi.koinDi.mainViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class appWithApi : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@appWithApi)
            modules(
                apiModule,
                mainViewModel
            )

        }
    }
}