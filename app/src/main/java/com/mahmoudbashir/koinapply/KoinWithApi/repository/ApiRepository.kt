package com.mahmoudbashir.koinapply.KoinWithApi.repository

import com.mahmoudbashir.koinapply.KoinWithApi.pojo.dataPosts
import com.mahmoudbashir.koinapply.KoinWithApi.retrofit.RetrofitInstance
import retrofit2.Response

class ApiRepository(private val retroInstance:RetrofitInstance){

    suspend fun getPosts():Response<List<dataPosts>> = retroInstance.api.getPosts()
}