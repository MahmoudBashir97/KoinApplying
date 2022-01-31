package com.mahmoudbashir.koinapply.simpleApply.modules

import com.mahmoudbashir.koinapply.simpleApply.models.Friend
import com.mahmoudbashir.koinapply.simpleApply.models.SchoolCourse
import com.mahmoudbashir.koinapply.simpleApply.models.Student
import com.mahmoudbashir.koinapply.simpleApply.viewModel.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val appModule = module {
    //TODO Define a Singleton of SchoolCourse
    single { SchoolCourse() }

    //TODO Create a Factory (creates new instance everytime)
    factory { Friend() }

    //TODO Create a Factory (creates new instance everytime)
    factory { Student(get(),get()) }

}

val viewModelModule = module {
    viewModel {  MainViewModel(get(),get())}

}