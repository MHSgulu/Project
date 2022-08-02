package com.kt.project.hwds;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.kt.project.databinding.ActivityMyHomePageBinding;

public class MyHomePageActivity extends AppCompatActivity {

    private ActivityMyHomePageBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMyHomePageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }


}