package com.mahmoudbashir.koinapply.simpleApply.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mahmoudbashir.koinapply.R
import com.mahmoudbashir.koinapply.simpleApply.models.Student
import com.mahmoudbashir.koinapply.simpleApply.viewModel.MainViewModel
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    val viewModel by inject<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val student = get<Student>()
        student.beSmart()

       /* val viewModel = get<MainViewModel>()
        viewModel.performAction()*/

        doSomething()
    }

    fun doSomething(){
        viewModel.performAction()
    }


}