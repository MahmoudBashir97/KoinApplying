package com.mahmoudbashir.koinapply.KoinWithApi.viewModelApi

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mahmoudbashir.koinapply.KoinWithApi.pojo.dataPosts
import com.mahmoudbashir.koinapply.KoinWithApi.repository.ApiRepository
import kotlinx.coroutines.launch
import retrofit2.Response

class ApiViewModel(val repo:ApiRepository): ViewModel() {
    val posts : MutableLiveData<List<dataPosts>> = MutableLiveData()

    fun getPosts() = viewModelScope.launch {
        repo.getPosts().apply {
            val body = this.body()
            if (body != null){
                posts.postValue(body)
            }
        }
    }
}