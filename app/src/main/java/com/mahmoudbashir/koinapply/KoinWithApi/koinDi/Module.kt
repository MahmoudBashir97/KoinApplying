package com.mahmoudbashir.koinapply.KoinWithApi.koinDi

import com.mahmoudbashir.koinapply.KoinWithApi.repository.ApiRepository
import com.mahmoudbashir.koinapply.KoinWithApi.retrofit.RetrofitInstance
import com.mahmoudbashir.koinapply.KoinWithApi.viewModelApi.ApiViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import kotlin.math.sin

val apiModule = module {

    single { RetrofitInstance() }
    single { ApiRepository(get()) }

}

val mainViewModel = module {

    viewModel {
        ApiViewModel(get())
    }

}