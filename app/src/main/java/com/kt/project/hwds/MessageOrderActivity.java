package com.kt.project.hwds;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.kt.project.databinding.ActivityMessageOrderBinding;
import com.kt.project.hwds.adapter.MessageOrderAdapter;

import java.util.ArrayList;
import java.util.List;

public class MessageOrderActivity extends AppCompatActivity {

    private ActivityMessageOrderBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMessageOrderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        List<String> dataList = new ArrayList<>();
        dataList.add("11");
        dataList.add("22");

        MessageOrderAdapter adapter = new MessageOrderAdapter();
        adapter.setList(dataList);
        binding.rvList.setAdapter(adapter);


    }


}