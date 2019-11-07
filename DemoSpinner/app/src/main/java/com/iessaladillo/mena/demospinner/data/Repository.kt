package com.iessaladillo.mena.demospinner.data

import com.iessaladillo.mena.demospinner.data.entity.Subject

object Repository {

    private val subjects: List<Subject> = listOf(
        Subject(1, "Math", "1º"),
        Subject(2, "Music", "1º"),
        Subject(3, "Computer Science", "2º")
    )

    fun queryAllSubjects() : List<Subject> = subjects
}