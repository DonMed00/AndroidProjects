package com.iessaladillo.mena.demorecyclerview.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.iessaladillo.mena.demorecyclerview.data.Repository

class MainActivityViewModelFactory(val repository: Repository) : ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
       return MainAcitvityViewModel(repository) as T
    }
}