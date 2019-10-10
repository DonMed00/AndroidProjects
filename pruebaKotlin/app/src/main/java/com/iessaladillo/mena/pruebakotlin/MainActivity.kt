package com.iessaladillo.mena.pruebakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupViews()
    }

    private fun setupViews() {
        btnGreet.setOnClickListener{ btnGreetOnClick()}
    }

    private fun btnGreetOnClick() {
        lblMessage.setText(txtName.text.toString())


    }
}
