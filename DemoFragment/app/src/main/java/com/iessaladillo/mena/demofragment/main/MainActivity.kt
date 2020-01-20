package com.iessaladillo.mena.demofragment.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import com.iessaladillo.mena.demofragment.option.OptionFragment
import com.iessaladillo.mena.demofragment.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupViews()
        if (savedInstanceState == null) {
            showInitialDestination()
        }

    }

    private fun setupViews() {
        btnOption1.setOnClickListener {
            showOption1()
        }

        btnOption2.setOnClickListener {
            showOption2()
        }
    }

    private fun showInitialDestination() {
        showOption1()
    }

    private fun showOption1() {
        supportFragmentManager.commit {
            replace(
                R.id.fcDetail,
                OptionFragment.newInstance(
                    1
                )
            )
            addToBackStack("")
        }
    }

    private fun showOption2() {
        supportFragmentManager.commit {
            replace(
                R.id.fcDetail,
                OptionFragment.newInstance(
                    2
                )
            )
            addToBackStack("")
        }
    }
}
