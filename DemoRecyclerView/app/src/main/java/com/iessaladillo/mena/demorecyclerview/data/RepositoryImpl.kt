package com.iessaladillo.mena.demorecyclerview.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.iessaladillo.mena.demorecyclerview.data.entity.Student

object RepositoryImpl : Repository {


    private val students: MutableList<Student> = mutableListOf(
        Student(1, "Baldomero", 18),
        Student(2, "Germán Ginés", 21),
        Student(3, "Rodolfo", 22)
    )

    private val studentsLiveData: MutableLiveData<List<Student>> = MutableLiveData(students)

    override fun queryAllStudents(): LiveData<List<Student>> =
        studentsLiveData//Es mejor devolver una copia, no la original

    override fun addStudent(student: Student){
        students.add(student)
        studentsLiveData.value = ArrayList<Student>(students)
    }
}