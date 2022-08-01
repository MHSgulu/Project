package com.kt.project.hwds;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.kt.project.databinding.ActivityMyBinding;

public class MyActivity extends AppCompatActivity {

    private ActivityMyBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMyBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }


}