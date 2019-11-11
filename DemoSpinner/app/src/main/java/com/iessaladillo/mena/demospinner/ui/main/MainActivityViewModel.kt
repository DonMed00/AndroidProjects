package com.iessaladillo.mena.demospinner.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.iessaladillo.mena.demospinner.data.DataSource
import com.iessaladillo.mena.demospinner.data.entity.Subject

class MainActivityViewModel(val repository:DataSource): ViewModel() {
    val subjects: LiveData<List<Subject>> = repository.queryAllSubjects()
}