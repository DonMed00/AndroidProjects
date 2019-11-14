package com.iessaladillo.mena.demorecyclerview.data

import androidx.lifecycle.LiveData
import com.iessaladillo.mena.demorecyclerview.data.entity.Student

interface Repository {
    fun queryAllStudents( ): LiveData<List<Student>>
    fun addStudent(student: Student)
}