package com.iessaladillo.mena.demospinner.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.activity.viewModels
import com.iessaladillo.mena.demospinner.R
import com.iessaladillo.mena.demospinner.data.Repository
import com.iessaladillo.mena.demospinner.data.entity.Subject
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val viewModel :MainActivityViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupViews()
    }

    private fun setupViews() {
        setupSpinner()
        btnShowSubject.setOnClickListener { show() }
    }

    private fun setupSpinner() {
        val listAdapter =
            ArrayAdapter<Subject>(this, android.R.layout.simple_spinner_item, viewModel.subjects)
        listAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spnSubjects.adapter = listAdapter
        spnSubjects.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                show()
            }

        }
    }

    private fun show() {
        val subject = spnSubjects.selectedItem as Subject
        Toast.makeText(this, subject.toString(), Toast.LENGTH_SHORT).show()
    }
}
