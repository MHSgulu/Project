package com.kt.project.sjzl

import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import com.google.android.material.tabs.TabLayoutMediator
import com.kt.project.R

class MyWareHouseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_ware_house)

        val toolbar: MaterialToolbar = findViewById(R.id.toolbar)
        toolbar.setNavigationOnClickListener {
            finish()
        }

        val tabLayout: TabLayout = findViewById(R.id.tab)
        val viewPager: ViewPager2 = findViewById(R.id.pager)


        //viewPager2去除头尾的滑动阴影
        val child = viewPager.getChildAt(0)
        (child as? RecyclerView)?.overScrollMode = View.OVER_SCROLL_NEVER


        var adapter = MyWareHouseAdapter(this)
        viewPager.adapter = adapter

        val tabLayoutMediator = TabLayoutMediator(
            tabLayout, viewPager
        ) { tab: TabLayout.Tab, position: Int ->
            val tabCustomView = TextView(this)

            //tabCustomView.setBackgroundColor(getColor(R.color.black))
            tabCustomView.gravity = Gravity.CENTER //内部文字居中 要不然显得指示器有点傻

            when(position){
                0 -> tabCustomView.text = "画布"
                1 -> tabCustomView.text = "音频"
                2 -> tabCustomView.text = "视频"
                3 -> tabCustomView.text = "三维模型图"
            }

            if (position == 0) {
                tabCustomView.textSize = 16f
                tabCustomView.setTextColor(getColor(R.color.c_333333))
            } else {
                tabCustomView.textSize = 14f
                tabCustomView.setTextColor(getColor(R.color.c_999999))
            }
            tab.customView = tabCustomView
        }
        tabLayoutMediator.attach()

        tabLayout.addOnTabSelectedListener(object : OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                val tabCustomView = tab.customView as TextView?
                if (tabCustomView != null) {
                    tabCustomView.setTextColor(getColor(R.color.c_333333))
                    tabCustomView.textSize = 18f
                }
            }
            override fun onTabUnselected(tab: TabLayout.Tab) {
                val tabCustomView = tab.customView as TextView?
                if (tabCustomView != null) {
                    tabCustomView.setTextColor(getColor(R.color.c_999999))
                    tabCustomView.textSize = 16f
                }
            }
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })




    }
}