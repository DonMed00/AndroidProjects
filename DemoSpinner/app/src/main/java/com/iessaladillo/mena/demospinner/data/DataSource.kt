package com.iessaladillo.mena.demospinner.data

import androidx.lifecycle.LiveData
import com.iessaladillo.mena.demospinner.data.entity.Subject

interface DataSource {
    fun queryAllSubjects() : LiveData<List<Subject>>
}