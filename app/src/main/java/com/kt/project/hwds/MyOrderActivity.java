package com.kt.project.hwds;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.tabs.TabLayoutMediator;
import com.kt.project.databinding.ActivityMyOrderBinding;

import java.util.ArrayList;
import java.util.List;

public class MyOrderActivity extends AppCompatActivity {

    private ActivityMyOrderBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMyOrderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        List<String> tabList = new ArrayList<>();
        tabList.add("全部");
        tabList.add("待支付");
        tabList.add("已支付");
        tabList.add("已预约");
        tabList.add("已完成");
        tabList.add("已取消");

        OrderFragmentStateAdapter adapter = new OrderFragmentStateAdapter(this,tabList);
        binding.viewPager2.setAdapter(adapter);
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(binding.tabLayout, binding.viewPager2, (tab, position) -> {
            tab.setText(tabList.get(position));
        });
        tabLayoutMediator.attach();


    }







}