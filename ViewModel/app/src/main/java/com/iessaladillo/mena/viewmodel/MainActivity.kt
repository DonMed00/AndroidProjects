package com.iessaladillo.mena.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val viewModel: MainActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupViews()
        showHomePoints()
        showVisitingPoints()
    }

    private fun setupViews() {
        btnHomeTeam3Points.setOnClickListener { incrementHomePoints(3) }
        btnHomeTeam2Points.setOnClickListener { incrementHomePoints(2) }
        btnHomeTeamFreeThrow.setOnClickListener { incrementHomePoints(1) }
        btnVisitingTeam3Points.setOnClickListener { incrementVisitingPoints(3) }
        btnVisitingTeam2Points.setOnClickListener { incrementVisitingPoints(2) }
        btnVisitingTeamFreeThrow.setOnClickListener { incrementVisitingPoints(1) }
        btnReset.setOnClickListener { reset() }
    }

    private fun incrementHomePoints(points: Int) {
        viewModel.incrementHomePoints(points)
        showHomePoints()
    }

    private fun incrementVisitingPoints(points: Int) {
        viewModel.incrementVisitingPoints(points)
        showVisitingPoints()
    }

    private fun showHomePoints() {
        lblHomeTeamPoints.text = viewModel.homeTeamPoints.toString()
    }

    private fun showVisitingPoints() {
        lblVisitingTeamPoints.text = viewModel.visitingTeamPoints.toString()
    }

    private fun reset() {
        viewModel.resetPoints()
        showHomePoints()
        showVisitingPoints()
    }
}
