package com.mahmoudbashir.koinapply.roomDb

import android.app.Application
import com.mahmoudbashir.koinapply.roomDb.koinDi.mainViewModel
import com.mahmoudbashir.koinapply.roomDb.koinDi.userDb
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class RoomApplication:Application()
{
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@RoomApplication)
            modules(
                userDb,
                mainViewModel
            )
        }
    }
}