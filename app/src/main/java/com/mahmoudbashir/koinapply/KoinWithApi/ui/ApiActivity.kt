package com.mahmoudbashir.koinapply.KoinWithApi.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.mahmoudbashir.koinapply.KoinWithApi.adapter.PostsAdapter
import com.mahmoudbashir.koinapply.KoinWithApi.viewModelApi.ApiViewModel
import com.mahmoudbashir.koinapply.R
import com.mahmoudbashir.koinapply.databinding.ActivityApiBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.koin.android.ext.android.inject

class ApiActivity : AppCompatActivity() {

    lateinit var apiBinding:ActivityApiBinding
    val viewModel  by inject<ApiViewModel>()
    lateinit var adpt:PostsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        apiBinding = DataBindingUtil.setContentView(this,R.layout.activity_api)

        setUpRecyclerView()

        viewModel.getPosts()

        runBlocking { delay(2000) }

       gettingDataToView()
    }

    private fun gettingDataToView() {
        viewModel.posts.observe(this,{
            if (it != null){
                Toast.makeText(applicationContext,"size : ${it.size}",Toast.LENGTH_LONG).show()
                Log.d("gettingPosts: ","success : $it")
                adpt.differ.submitList(it)
            }
        }
        )
    }

    private fun setUpRecyclerView(){
        adpt = PostsAdapter()
        apiBinding.recPosts.apply {
            setHasFixedSize(true)
            adapter = adpt
        }

    }
}