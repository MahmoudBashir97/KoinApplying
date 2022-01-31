package com.mahmoudbashir.koinapply.roomDb.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.mahmoudbashir.koinapply.roomDb.pojo.UserInfoModel

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addUser(user:UserInfoModel )

    @Query("select * from user_info")
    fun getAllUser(): LiveData<List<UserInfoModel>>

   /* @Query("UPDATE userTable SET fullName =:updateName, Designation=:updateDesignation where userID=:id")
    fun updateUser(id: Int, updateName: String, updateDesignation: String)*/

    @Delete
    fun deleteUser( deleteUser: UserInfoModel)
}