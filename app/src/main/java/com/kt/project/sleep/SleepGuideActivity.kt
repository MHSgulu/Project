package com.kt.project.sleep

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kt.project.databinding.ActivityGuideSleepBinding
import com.kt.project.sleep.dialog.SelectMusicDialogFragment
import com.kt.project.sleep.dialog.SelectMusicListDialogFragment


class SleepGuideActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGuideSleepBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGuideSleepBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.toolbar.setNavigationOnClickListener {
            onBackPressed()
        }

        binding.bt1.setOnClickListener {
            val intent = Intent(this, RestPlanActivity::class.java)
            startActivity(intent)
        }

        binding.bt2.setOnClickListener {
            SelectMusicDialogFragment.newInstance().show(supportFragmentManager,"1")
        }

        binding.bt3.setOnClickListener {
            SelectMusicListDialogFragment.newInstance().show(supportFragmentManager,"2")
        }

    }
}