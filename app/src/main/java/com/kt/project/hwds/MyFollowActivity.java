package com.kt.project.hwds;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.kt.project.databinding.ActivityMyFollowBinding;
import com.kt.project.hwds.adapter.MyFollowAdapter;

import java.util.ArrayList;
import java.util.List;

public class MyFollowActivity extends AppCompatActivity {

    private ActivityMyFollowBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMyFollowBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        List<String> dataList = new ArrayList<>();
        dataList.add("咖啡不加糖");
        dataList.add("丹青吃薄荷。");
        dataList.add("zis");
        dataList.add("往日不再");
        dataList.add("丽小珊");

        MyFollowAdapter adapter = new MyFollowAdapter();
        adapter.setList(dataList);
        binding.rvList.setAdapter(adapter);


    }


}