package com.mahmoudbashir.koinapply.roomDb

import android.app.Application
import androidx.lifecycle.LiveData
import com.mahmoudbashir.koinapply.roomDb.db.UserDatabase
import com.mahmoudbashir.koinapply.roomDb.pojo.UserInfoModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class Roomrepository(val application: Application,val db:UserDatabase) {

     fun insertData(userInfoModel: UserInfoModel) {
         GlobalScope.launch {
             db.dao().addUser(userInfoModel)
         }
     }

    fun getAllUsers():LiveData<List<UserInfoModel>> = db.dao().getAllUser()
}