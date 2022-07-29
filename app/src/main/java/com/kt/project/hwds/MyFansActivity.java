package com.kt.project.hwds;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.kt.project.databinding.ActivityMyFansBinding;
import com.kt.project.hwds.adapter.MyFansAdapter;

import java.util.ArrayList;
import java.util.List;

public class MyFansActivity extends AppCompatActivity {

    private ActivityMyFansBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMyFansBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        List<String> dataList = new ArrayList<>();
        dataList.add("咖啡不加糖");
        dataList.add("丹青吃薄荷。");
        dataList.add("zis");
        dataList.add("往日不再");
        dataList.add("丽小珊");

        MyFansAdapter adapter = new MyFansAdapter();
        adapter.setList(dataList);
        binding.rvList.setAdapter(adapter);


    }


}