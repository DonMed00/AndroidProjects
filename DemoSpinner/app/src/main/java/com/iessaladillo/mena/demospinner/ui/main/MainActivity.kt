package com.iessaladillo.mena.demospinner.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.observe
import com.iessaladillo.mena.demospinner.R
import com.iessaladillo.mena.demospinner.data.Repository
import com.iessaladillo.mena.demospinner.data.entity.Subject
import com.iessaladillo.mena.demospinner.utils.doOnItemSelected
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val viewModel: MainActivityViewModel by viewModels {
        MainActivityViewModelFactory(Repository)
    }
    val listAdapter: ArrayAdapter<Subject> by lazy {
        ArrayAdapter<Subject>(
            this,
            android.R.layout.simple_spinner_item,
            mutableListOf()
        ).apply {
            setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupViews()
        observeSubjects()
    }

    private fun setupViews() {
        setupSpinner()
        btnShowSubject.setOnClickListener { show() }
    }

    private fun setupSpinner() {
        /*
        listAdapter =
            ArrayAdapter<Subject>(this, android.R.layout.simple_spinner_item, mutableListOf())
        listAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
*/
        spnSubjects.run {
            adapter = listAdapter
            doOnItemSelected { _, _, _, _ -> show() }
        }
    }

    private fun observeSubjects() {
        viewModel.subjects.observe(this) { updateSpinnerData(it) }
    }

    private fun updateSpinnerData(subjects: List<Subject>) {
        listAdapter.clear()
        listAdapter.addAll(subjects)
    }

    private fun show() {
        val subject = spnSubjects.selectedItem as Subject
        Toast.makeText(this, subject.toString(), Toast.LENGTH_SHORT).show()
    }
}
