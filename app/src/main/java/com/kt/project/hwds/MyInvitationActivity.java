package com.kt.project.hwds;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.kt.project.databinding.ActivityMyAssetsBinding;
import com.kt.project.databinding.ActivityMyInvitationBinding;
import com.kt.project.hwds.adapter.MyAssetsAdapter;

import java.util.ArrayList;
import java.util.List;

public class MyInvitationActivity extends AppCompatActivity {

    private ActivityMyInvitationBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMyInvitationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }


}