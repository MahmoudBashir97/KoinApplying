package com.mahmoudbashir.koinapply.roomDb.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mahmoudbashir.koinapply.roomDb.pojo.UserInfoModel

@Database(entities = [UserInfoModel::class], version = 1,exportSchema = false)
abstract class UserDatabase : RoomDatabase(){
     abstract fun dao():UserDao
}