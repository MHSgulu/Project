package com.kt.project

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var textView1:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        textView1 = findViewById(R.id.tv1)
        textView1.setOnClickListener {
            val intent = Intent(this, AboutUsActivity::class.java)
            startActivity(intent)
        }

        var textView2:TextView = findViewById(R.id.tv2)
        textView2.setOnClickListener {
            val intent = Intent(this, MyInfoActivity::class.java)
            startActivity(intent)
        }

        var textView3:TextView = findViewById(R.id.tv3)
        textView3.setOnClickListener {
            val intent = Intent(this, AccountSecurityActivity::class.java)
            startActivity(intent)
        }

        var textView4:TextView = findViewById(R.id.tv4)
        textView4.setOnClickListener {
            val intent = Intent(this, ChangePhoneActivity::class.java)
            startActivity(intent)
        }

        var textView5:TextView = findViewById(R.id.tv5)
        textView5.setOnClickListener {
            val intent = Intent(this, ModifyPasswordActivity::class.java)
            startActivity(intent)
        }

        var textView6:TextView = findViewById(R.id.tv6)
        textView6.setOnClickListener {
            val intent = Intent(this, FeedbackActivity::class.java)
            startActivity(intent)
        }

    }
}