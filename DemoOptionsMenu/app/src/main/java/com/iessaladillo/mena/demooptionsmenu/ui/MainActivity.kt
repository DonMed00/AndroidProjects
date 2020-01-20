package com.iessaladillo.mena.demooptionsmenu.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.iessaladillo.mena.demooptionsmenu.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupAppBar()
    }


    private fun setupAppBar() {
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_activity, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.mnuSettings -> navigateToSettings()

            else -> return super.onOptionsItemSelected(item)

        }
        return true
    }


    private fun navigateToSettings() {
        Toast.makeText(this,"Navegar a Settings",Toast.LENGTH_SHORT).show()
    }
}
