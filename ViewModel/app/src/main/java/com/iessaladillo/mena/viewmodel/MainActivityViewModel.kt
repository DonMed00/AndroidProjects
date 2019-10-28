package com.iessaladillo.mena.viewmodel

import androidx.lifecycle.ViewModel

class MainActivityViewModel() : ViewModel() {
    var homeTeamPoints: Int = 0
        private set
    var visitingTeamPoints: Int = 0
        private set

    fun incrementHomePoints(points: Int) {
        homeTeamPoints += points
    }

    fun incrementVisitingPoints(points: Int) {
        visitingTeamPoints += points
    }

    fun resetPoints() {
        homeTeamPoints = 0
        visitingTeamPoints = 0
    }
}