package com.iessaladillo.mena.demospinner.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.iessaladillo.mena.demospinner.data.entity.Subject

object Repository :  DataSource {

    private val subjects: List<Subject> = listOf(
        Subject(1, "Math", "1º"),
        Subject(2, "Music", "1º"),
        Subject(3, "Computer Science", "2º")
    )

    private val subjectsLiveData = MutableLiveData<List<Subject>>(subjects)

    override fun queryAllSubjects() : LiveData<List<Subject>> = subjectsLiveData
}