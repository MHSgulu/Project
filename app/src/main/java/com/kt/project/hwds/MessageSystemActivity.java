package com.kt.project.hwds;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.kt.project.databinding.ActivityMessageSystemBinding;
import com.kt.project.hwds.adapter.MessageSystemAdapter;

import java.util.ArrayList;
import java.util.List;

public class MessageSystemActivity extends AppCompatActivity {

    private ActivityMessageSystemBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMessageSystemBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        List<String> dataList = new ArrayList<>();
        dataList.add("系统升级维护通知");
        dataList.add("系统升级维护通知");

        MessageSystemAdapter adapter = new MessageSystemAdapter();
        adapter.setList(dataList);
        binding.rvList.setAdapter(adapter);


    }


}