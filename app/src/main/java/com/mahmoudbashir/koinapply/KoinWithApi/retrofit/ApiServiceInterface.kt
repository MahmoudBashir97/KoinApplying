package com.mahmoudbashir.koinapply.KoinWithApi.retrofit

import com.mahmoudbashir.koinapply.KoinWithApi.pojo.dataPosts
import retrofit2.Response
import retrofit2.http.GET

interface ApiServiceInterface {
    @GET("posts")
    suspend fun getPosts():Response<List<dataPosts>>
}