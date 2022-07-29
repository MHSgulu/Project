package com.kt.project.hwds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.kt.project.databinding.ActivityInvitedPersonListBinding;
import com.kt.project.hwds.adapter.InvitedPersonAdapter;

import java.util.ArrayList;
import java.util.List;

public class InvitedPersonListActivity extends AppCompatActivity {

    private ActivityInvitedPersonListBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityInvitedPersonListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        List<String> dataList = new ArrayList<>();
        dataList.add("咖啡不加糖");
        dataList.add("丹青吃薄荷。");
        dataList.add("zis");
        dataList.add("往日不再");
        dataList.add("丽小珊");

        InvitedPersonAdapter adapter = new InvitedPersonAdapter();
        adapter.setList(dataList);
        binding.rvList.setAdapter(adapter);


    }


}