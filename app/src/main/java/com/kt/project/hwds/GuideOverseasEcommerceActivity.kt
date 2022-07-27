package com.kt.project.hwds

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kt.project.databinding.ActivityGuideOeBinding


class GuideOverseasEcommerceActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGuideOeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGuideOeBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.toolbar.setNavigationOnClickListener {
            onBackPressed()
        }

        binding.tv1.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        binding.tv2.setOnClickListener {
            val intent = Intent(this, BindMobileNumberActivity::class.java)
            startActivity(intent)
        }


    }
}