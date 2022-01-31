package com.mahmoudbashir.koinapply.roomDb.pojo

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_info")
data class UserInfoModel (
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val Name:String,
    val age:Int)