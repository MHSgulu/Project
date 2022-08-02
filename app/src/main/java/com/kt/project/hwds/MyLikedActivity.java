
package com.kt.project.hwds;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.kt.project.databinding.ActivityMyLikedBinding;
import com.kt.project.hwds.adapter.MyLikedAdapter;

import java.util.ArrayList;
import java.util.List;

public class MyLikedActivity extends AppCompatActivity {

    private ActivityMyLikedBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMyLikedBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        List<String> dataList = new ArrayList<>();
        dataList.add("咖啡不加糖");
        dataList.add("丹青吃薄荷。");
        dataList.add("zis");
        dataList.add("往日不再");
        dataList.add("丽小珊");

        MyLikedAdapter adapter = new MyLikedAdapter();
        adapter.setList(dataList);
        binding.rvList.setAdapter(adapter);


    }


}