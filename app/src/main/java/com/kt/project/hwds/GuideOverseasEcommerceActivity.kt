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
            val intent = Intent(this, InvitedPersonListActivity::class.java)
            startActivity(intent)
        }

        binding.bt12.setOnClickListener {
            val intent = Intent(this, MyFollowActivity::class.java)
            startActivity(intent)
        }

        binding.bt13.setOnClickListener {
            val intent = Intent(this, MyFansActivity::class.java)
            startActivity(intent)
        }

        binding.bt14.setOnClickListener {
            val intent = Intent(this, MessageFollowActivity::class.java)
            startActivity(intent)
        }

        binding.bt15.setOnClickListener {
            val intent = Intent(this, MessageSystemActivity::class.java)
            startActivity(intent)
        }

        binding.bt16.setOnClickListener {
            val intent = Intent(this, MessageInvitedActivity::class.java)
            startActivity(intent)
        }

        binding.bt17.setOnClickListener {
            val intent = Intent(this, MessageCommissionActivity::class.java)
            startActivity(intent)
        }

        binding.bt18.setOnClickListener {
            val intent = Intent(this, MessageOrderActivity::class.java)
            startActivity(intent)
        }

        binding.bt19.setOnClickListener {
            val intent = Intent(this, MessageActivity::class.java)
            startActivity(intent)
        }

        binding.bt20.setOnClickListener {
            val intent = Intent(this, MyAssetsActivity::class.java)
            startActivity(intent)
        }

        binding.bt21.setOnClickListener {
            val intent = Intent(this, MyInvitationActivity::class.java)
            startActivity(intent)
        }

        binding.bt22.setOnClickListener {
            val intent = Intent(this, MyActivity::class.java)
            startActivity(intent)
        }

        binding.bt23.setOnClickListener {
            val intent = Intent(this, MyOrderActivity::class.java)
            startActivity(intent)
        }


    }
}