package com.kt.project.hwds;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.kt.project.databinding.FragmentOrderListBinding;
import com.kt.project.hwds.adapter.MyOrderAdapter;

import java.util.ArrayList;
import java.util.List;


public class OrderListFragment extends Fragment {

    private FragmentOrderListBinding binding;


    public static OrderListFragment newInstance() {
        Bundle args = new Bundle();
        OrderListFragment fragment = new OrderListFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentOrderListBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        List<String> dataList = new ArrayList<>();
        dataList.add("11");
        dataList.add("22");
        dataList.add("11");
        dataList.add("22");
        dataList.add("11");
        dataList.add("22");

        MyOrderAdapter adapter = new MyOrderAdapter();
        adapter.setList(dataList);
        binding.rvList.setAdapter(adapter);

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
