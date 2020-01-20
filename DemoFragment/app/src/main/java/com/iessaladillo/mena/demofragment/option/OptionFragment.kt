package com.iessaladillo.mena.demofragment.option

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import com.iessaladillo.mena.demofragment.R
import kotlinx.android.synthetic.main.fragment_option.*


/**
 * A simple [Fragment] subclass.
 */
class OptionFragment() : Fragment(R.layout.fragment_option) {


    private val viewmodel: OptionFragmentViewModel by viewModels()
    val option: Int by lazy {
        arguments?.getInt(ARG_OPTION) ?: 0
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setupViews(requireView())
        observeViewModel()

    }

    private fun observeViewModel() {
        viewmodel.count.observe(this) {
            showCount()
        }
    }

    private fun setupViews(view: View) {
        activity?.title = getString(R.string.option_title, option)
        btnIncrement.setOnClickListener {
            viewmodel.incrementCount()
            showCount()
        }
    }


    private fun showCount() {
        lblNumber.text = viewmodel.count.value.toString()
    }

    companion object {
        const val ARG_OPTION = "ARG_NUMBER"

        fun newInstance(number: Int) =
            OptionFragment().apply {
                arguments = bundleOf(ARG_OPTION to number)
            }
    }

}
