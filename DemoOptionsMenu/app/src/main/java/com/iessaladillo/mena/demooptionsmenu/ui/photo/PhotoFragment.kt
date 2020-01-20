package com.iessaladillo.mena.demooptionsmenu.ui.photo

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment

import com.iessaladillo.mena.demooptionsmenu.R

class PhotoFragment : Fragment(R.layout.photo_fragment) {

    companion object {
        fun newInstance() = PhotoFragment()
    }

    private lateinit var viewModel: PhotoViewModel

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(PhotoViewModel::class.java)
        setupViews()
    }

    private fun setupViews() {
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.photo_fragment, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem) =
        when (item.itemId) {
            // ...
            R.id.mnuAdd -> {
                navigateToInfo()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }

    private fun navigateToInfo() {
        requireActivity().supportFragmentManager
        Toast.makeText(context,"Add", Toast.LENGTH_SHORT).show()
        }


}
