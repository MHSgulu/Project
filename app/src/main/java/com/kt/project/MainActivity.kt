package com.kt.project

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kt.project.databinding.ActivityMainBinding
import com.kt.project.hwds.GuideOverseasEcommerceActivity
import com.kt.project.sjzl.GuideDigitalExhibitionActivity
import com.kt.project.sleep.SleepGuideActivity


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.mcvDe.setOnClickListener {
            val intent = Intent(this, GuideDigitalExhibitionActivity::class.java)
            startActivity(intent)
        }

        binding.mcvOe.setOnClickListener {
            val intent = Intent(this, GuideOverseasEcommerceActivity::class.java)
            startActivity(intent)
        }

        binding.mcvSleep.setOnClickListener {
            val intent = Intent(this, SleepGuideActivity::class.java)
            startActivity(intent)
        }


    }



}