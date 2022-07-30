package com.kt.project.hwds;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.kt.project.databinding.ActivityMessageInvitedBinding;
import com.kt.project.hwds.adapter.MessageInvitedAdapter;

import java.util.ArrayList;
import java.util.List;

public class MessageInvitedActivity extends AppCompatActivity {

    private ActivityMessageInvitedBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMessageInvitedBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        List<String> dataList = new ArrayList<>();
        dataList.add("您已成功邀请 华少德");
        dataList.add("您已成功邀请 小红帽");

        MessageInvitedAdapter adapter = new MessageInvitedAdapter();
        adapter.setList(dataList);
        binding.rvList.setAdapter(adapter);


    }


}