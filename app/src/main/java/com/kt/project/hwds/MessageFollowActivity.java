package com.kt.project.hwds;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.kt.project.databinding.ActivityMessageFollowBinding;
import com.kt.project.hwds.adapter.MessageFollowAdapter;

import java.util.ArrayList;
import java.util.List;

public class MessageFollowActivity extends AppCompatActivity {

    private ActivityMessageFollowBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMessageFollowBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        List<String> dataList = new ArrayList<>();
        dataList.add("武林阿拉士");
        dataList.add("陈氏大人物");

        MessageFollowAdapter adapter = new MessageFollowAdapter();
        adapter.setList(dataList);
        binding.rvList.setAdapter(adapter);


    }


}