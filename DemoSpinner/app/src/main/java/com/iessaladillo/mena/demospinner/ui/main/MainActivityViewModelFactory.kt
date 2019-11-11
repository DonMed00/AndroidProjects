package com.iessaladillo.mena.demospinner.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.iessaladillo.mena.demospinner.data.DataSource

class MainActivityViewModelFactory(val dataSource: DataSource) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainActivityViewModel(dataSource) as T
    }
}