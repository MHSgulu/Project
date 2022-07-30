package com.kt.project.hwds.adapter;


import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.kt.project.R;

import org.jetbrains.annotations.NotNull;


public class MessageAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

    public MessageAdapter() {
        super(R.layout.item_message);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder holder, @NotNull String data) {
        holder.setText(R.id.tv_title, "系统消息");
        holder.setText(R.id.tv_time, "昨天 20:36");
        holder.setText(R.id.tv_message, "系统升级维护通知：平台将于...");
        holder.setText(R.id.tv_num, "1");


    }
}
