package com.iessaladillo.mena.demorecyclerview.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.iessaladillo.mena.demorecyclerview.data.Repository
import com.iessaladillo.mena.demorecyclerview.data.entity.Student

class MainAcitvityViewModel(val repository: Repository) : ViewModel() {

    val students : LiveData<List<Student>> = repository.queryAllStudents()

    fun addStudent(student: Student) {
        repository.addStudent(student)
    }
}