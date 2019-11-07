package com.iessaladillo.mena.demospinner.ui.main

import androidx.lifecycle.ViewModel
import com.iessaladillo.mena.demospinner.data.Repository
import com.iessaladillo.mena.demospinner.data.entity.Subject

class MainActivityViewModel : ViewModel() {
    val subjects: List<Subject> = Repository.queryAllSubjects()
}