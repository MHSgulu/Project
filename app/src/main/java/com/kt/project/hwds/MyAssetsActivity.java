package com.kt.project.hwds;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.kt.project.databinding.ActivityMyAssetsBinding;
import com.kt.project.hwds.adapter.MyAssetsAdapter;

import java.util.ArrayList;
import java.util.List;

public class MyAssetsActivity extends AppCompatActivity {

    private ActivityMyAssetsBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMyAssetsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        List<String> dataList = new ArrayList<>();
        dataList.add("1");
        dataList.add("2");
        dataList.add("3");
        dataList.add("4");
        dataList.add("5");
        dataList.add("5");
        dataList.add("5");
        dataList.add("5");
        dataList.add("5");
        dataList.add("5");
        dataList.add("5");
        dataList.add("5");
        dataList.add("5");
        dataList.add("5");
        dataList.add("5");

        MyAssetsAdapter adapter = new MyAssetsAdapter();
        adapter.setList(dataList);
        binding.rvList.setAdapter(adapter);



    }


}