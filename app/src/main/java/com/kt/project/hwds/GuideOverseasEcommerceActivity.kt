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

        binding.bt1.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        binding.bt2.setOnClickListener {
            val intent = Intent(this, BindMobileNumberActivity::class.java)
            startActivity(intent)
        }

        binding.bt3.setOnClickListener {
            val intent = Intent(this, EditInformationActivity::class.java)
            startActivity(intent)
        }

        binding.bt4.setOnClickListener {
            val intent = Intent(this, ModifyPhoneNumberActivity::class.java)
            startActivity(intent)
        }

        binding.bt5.setOnClickListener {
            val intent = Intent(this, RechargeActivity::class.java)
            startActivity(intent)
        }

        binding.bt6.setOnClickListener {
            val intent = Intent(this, WithdrawActivity::class.java)
            startActivity(intent)
        }

        binding.bt7.setOnClickListener {
            val intent = Intent(this, ModifyLoginPasswordActivity::class.java)
            startActivity(intent)
        }

        binding.bt8.setOnClickListener {
            val intent = Intent(this, VerifiedNameActivity::class.java)
            startActivity(intent)
        }

        binding.bt9.setOnClickListener {
            val intent = Intent(this, AppSettingsActivity::class.java)
            startActivity(intent)
        }

        binding.bt10.setOnClickListener {
            val intent = Intent(this, MessageDetailsActivity::class.java)
            startActivity(intent)
        }

        binding.bt11.setOnClickListener {
            val intent = Intent(this, InvitedPersonActivity::class.java)
            startActivity(intent)
        }



    }
}