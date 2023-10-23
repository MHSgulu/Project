package com.kt.project.sleep

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kt.project.databinding.ActivityRestPlanBinding

class RestPlanActivity : AppCompatActivity() {

    private lateinit var binding:ActivityRestPlanBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRestPlanBinding.inflate(layoutInflater);
        setContentView(binding.root)

        binding.toolbar.setNavigationOnClickListener {
            onBackPressed()
        }

    }


}