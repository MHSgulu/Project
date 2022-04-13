package com.kt.project.sjzl

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kt.project.R

class WareTypeFragment : Fragment() {

    companion object {
        fun newInstance() = WareTypeFragment()
    }

    private lateinit var viewModel: WareTypeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.ware_type_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(WareTypeViewModel::class.java)
        // TODO: Use the ViewModel
    }

}