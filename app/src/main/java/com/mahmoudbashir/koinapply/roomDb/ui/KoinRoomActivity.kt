package com.mahmoudbashir.koinapply.roomDb.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.mahmoudbashir.koinapply.R
import com.mahmoudbashir.koinapply.roomDb.pojo.UserInfoModel
import com.mahmoudbashir.koinapply.roomDb.viewModelDb.RoomViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.koin.android.ext.android.inject

class KoinRoomActivity : AppCompatActivity() {

    val viewModel by inject<RoomViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_koin_room)

        insertDataToRoom()

        getAllDataInserted()

    }

    private fun getAllDataInserted() {
        viewModel.getAllUser().observe(this,{
            if(it != null){
                Log.d("gettingData: "," success : $it")
            }
        })
    }

    private fun insertDataToRoom() {
        val d = UserInfoModel(0,"Zaki",13)
        viewModel.addUser(d)
    }
}