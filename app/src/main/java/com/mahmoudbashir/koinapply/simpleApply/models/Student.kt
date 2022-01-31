package com.mahmoudbashir.koinapply.simpleApply.models

class Student(val course:SchoolCourse ,val friend : Friend) {


    fun beSmart(){
        course.study()
        friend.hangout()
    }
}

class SchoolCourse{
    fun study(){
        print("I'm studying")
    }
}

class Friend{
    fun hangout(){
        print("We're hanging out")
    }
}