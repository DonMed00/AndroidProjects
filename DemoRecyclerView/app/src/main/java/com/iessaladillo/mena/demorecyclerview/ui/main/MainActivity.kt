package com.iessaladillo.mena.demorecyclerview.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.lifecycle.observe
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.iessaladillo.mena.demorecyclerview.R
import com.iessaladillo.mena.demorecyclerview.data.RepositoryImpl
import com.iessaladillo.mena.demorecyclerview.data.entity.Student
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private val random : Random = Random()
    private val viewModel : MainAcitvityViewModel by viewModels{
        MainActivityViewModelFactory(RepositoryImpl)
    }
    private val listAdapter: MainActivityAdapter = MainActivityAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupViews()
        observeStudents()
    }




    private fun setupViews() {
        setupRecyclerView()
        btnAdd.setOnClickListener { addFakeSudent() }
    }

    private fun addFakeSudent() {
        val value = random.nextInt(100)
        viewModel.addStudent(Student(5 + value.toLong(),"Lorenzo${value}",value))
    }

    private fun setupRecyclerView() {
        lstStudents.run {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this.context) //Required
            addItemDecoration(DividerItemDecoration(this.context, RecyclerView.VERTICAL))
            itemAnimator = DefaultItemAnimator()
            adapter = listAdapter//adaptador ultimo por si falla. Required
        }
    }

    private fun updateList(newList: List<Student>) {
        lstStudents.post{
            listAdapter.submitList(newList)
            lblEmptyView.visibility = if (newList.isEmpty()) View.VISIBLE else View.INVISIBLE
        }
    }

    private fun observeStudents() {
        viewModel.students.observe(this){
            updateList(it)
        }
    }
}
