package com.kt.project.hwds;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.kt.project.databinding.ActivityMessageCommissionBinding;
import com.kt.project.hwds.adapter.MessageCommissionAdapter;

import java.util.ArrayList;
import java.util.List;

public class MessageCommissionActivity extends AppCompatActivity {

    private ActivityMessageCommissionBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMessageCommissionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        List<String> dataList = new ArrayList<>();
        dataList.add("11");
        dataList.add("22");

        MessageCommissionAdapter adapter = new MessageCommissionAdapter();
        adapter.setList(dataList);
        binding.rvList.setAdapter(adapter);


    }


}