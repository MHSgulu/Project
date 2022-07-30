package com.kt.project.hwds.adapter;


import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.kt.project.R;

import org.jetbrains.annotations.NotNull;


public class MyAssetsAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

    public MyAssetsAdapter() {
        super(R.layout.item_assets_details);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder holder, @NotNull String data) {
        holder.setText(R.id.tv_title, "购买商品佣金发放");
        holder.setText(R.id.tv_time, "2022-06-24 21:08");
        holder.setText(R.id.tv_status, "已到账");
        holder.setText(R.id.tv_num, "+5.00");


    }
}
