package com.iessaladillo.mena.demospinner.data.entity

data class Subject(val id : Long, val name: String,val grade: String){
    override fun toString(): String {
        return name
    }
}