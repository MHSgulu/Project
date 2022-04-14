package com.kt.project.sjzl

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kt.project.R

class WareTypeFragment : Fragment() {

    companion object {
        fun newInstance() = WareTypeFragment()
    }

    private lateinit var viewModel: WareTypeViewModel

    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.ware_type_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(WareTypeViewModel::class.java)

        recyclerView = view.findViewById(R.id.list)
        val adapter =  WareHouseTypeAdapter()
        recyclerView.adapter = adapter


    }

}