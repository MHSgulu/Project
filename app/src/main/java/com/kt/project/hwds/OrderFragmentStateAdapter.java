package com.kt.project.hwds;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.List;


public class OrderFragmentStateAdapter extends FragmentStateAdapter {

    private final List<String> tabTitleList;

    public OrderFragmentStateAdapter(FragmentActivity fragmentActivity, List<String> list) {
        super(fragmentActivity);
        tabTitleList = list;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return OrderListFragment.newInstance();
    }

    @Override
    public int getItemCount() {
        return tabTitleList.size();
    }
}
