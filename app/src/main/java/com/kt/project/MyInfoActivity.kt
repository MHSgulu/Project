package com.kt.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.appbar.MaterialToolbar

class MyInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_info)

        var toolbar: MaterialToolbar = findViewById(R.id.toolbar)
        toolbar.setNavigationOnClickListener {
            finish()
        }

    }
}