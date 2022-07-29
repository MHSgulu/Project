package com.kt.project.hwds.adapter;


import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.kt.project.R;

import org.jetbrains.annotations.NotNull;


public class MyFansAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

    public MyFansAdapter() {
        super(R.layout.item_my_fans);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder holder, @NotNull String data) {
        holder.setText(R.id.tv_name, data);
        holder.setText(R.id.tv_time, "2022-06-21 08:10");

    }
}
