package com.iessaladillo.mena.demospinner.utils

import android.view.View
import android.widget.AdapterView
import android.widget.Spinner

public fun Spinner.doOnItemSelected(
    action: (
        parent: AdapterView<*>?,
        view: View?,
        position: Int,
        id: Long
    ) -> Unit
) {
    onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
        override fun onNothingSelected(parent: AdapterView<*>?) {
        }

        override fun onItemSelected(
            parent: AdapterView<*>?,
            view: View?,
            position: Int,
            id: Long
        ) {
            action(parent, view, position, id)
        }

    }
}
