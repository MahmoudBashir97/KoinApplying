package com.mahmoudbashir.koinapply.roomDb.viewModelDb

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mahmoudbashir.koinapply.roomDb.Roomrepository
import com.mahmoudbashir.koinapply.roomDb.db.UserDao
import com.mahmoudbashir.koinapply.roomDb.pojo.UserInfoModel
import kotlinx.coroutines.launch

class RoomViewModel(val repo:Roomrepository): ViewModel() {


    fun getAllUser(): LiveData<List<UserInfoModel>> = repo.getAllUsers()

    fun addUser(userAdd: UserInfoModel) = viewModelScope.launch{
        repo.insertData(userAdd)
    }

   /* fun updateUser(id: Int, updateName: String, updateDesignation: String) {
        dao.updateUser(id, updateName, updateDesignation)
    }*/

   /* fun deleteUser(userDelete: UserInfoModel) {
        dao.deleteUser(userDelete)
    }*/
}