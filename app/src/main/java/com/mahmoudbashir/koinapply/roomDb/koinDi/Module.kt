package com.mahmoudbashir.koinapply.roomDb.koinDi

import android.app.Application
import androidx.room.Room
import com.mahmoudbashir.koinapply.roomDb.Roomrepository
import com.mahmoudbashir.koinapply.roomDb.db.UserDao
import com.mahmoudbashir.koinapply.roomDb.db.UserDatabase
import com.mahmoudbashir.koinapply.roomDb.viewModelDb.RoomViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val userDb = module {
    fun providerDatabase(application: Application):UserDatabase{
        return Room.databaseBuilder(application,UserDatabase::class.java,"UserDb")
            .fallbackToDestructiveMigration()
            .build()
    }

    fun providerDao(db:UserDatabase):UserDao{
        return db.dao()
    }



    single { providerDatabase(androidApplication()) }
    single { providerDao(get()) }
    single { Roomrepository(androidApplication(),get()) }

}

val mainViewModel = module {
    viewModel {
        RoomViewModel(get())
    }
}