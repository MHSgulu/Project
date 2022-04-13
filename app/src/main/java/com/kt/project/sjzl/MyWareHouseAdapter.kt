package com.kt.project.sjzl

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class MyWareHouseAdapter(fragmentActivity: FragmentActivity?) :
    FragmentStateAdapter(fragmentActivity!!) {
    override fun createFragment(position: Int): Fragment {
        return WareTypeFragment.newInstance()
    }

    override fun getItemCount(): Int {
        return 4
    }
}