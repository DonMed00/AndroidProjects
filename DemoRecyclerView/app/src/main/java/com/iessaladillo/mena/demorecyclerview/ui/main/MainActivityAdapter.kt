package com.iessaladillo.mena.demorecyclerview.ui.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.iessaladillo.mena.demorecyclerview.R
import com.iessaladillo.mena.demorecyclerview.data.entity.Student

class MainActivityAdapter : ListAdapter<Student,MainActivityAdapter.ViewHolder>(StudentDiffCallback) {

    private var data: List<Student> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemView = layoutInflater.inflate(R.layout.activity_main_item, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int = data.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val student = data[position]
        holder.bind(student)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val lblName: TextView = itemView.findViewById(R.id.lblName)
        private val lblAge: TextView = itemView.findViewById(R.id.lblAge)

        fun bind(student: Student) {
            student.run {
                lblName.text = name
                lblAge.text = age.toString()
            }
        }

    }
    object  StudentDiffCallback: DiffUtil.ItemCallback<Student>(){
        override fun areItemsTheSame(oldItem: Student, newItem: Student): Boolean =
            oldItem.id == newItem.id


        override fun areContentsTheSame(oldItem: Student, newItem: Student): Boolean =
            oldItem.name==newItem.name && oldItem.age==newItem.age
    }
}