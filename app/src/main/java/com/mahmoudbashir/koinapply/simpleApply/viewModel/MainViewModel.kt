package com.mahmoudbashir.koinapply.simpleApply.viewModel

import androidx.lifecycle.ViewModel
import com.mahmoudbashir.koinapply.simpleApply.models.Friend
import com.mahmoudbashir.koinapply.simpleApply.models.SchoolCourse

class MainViewModel(val schoolCourse: SchoolCourse,val friend: Friend): ViewModel() {

    fun performAction(){
        friend.hangout()
        schoolCourse.study()
    }
}