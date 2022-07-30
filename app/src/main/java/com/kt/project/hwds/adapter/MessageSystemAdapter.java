package com.kt.project.hwds.adapter;


import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.kt.project.R;

import org.jetbrains.annotations.NotNull;


public class MessageSystemAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

    public MessageSystemAdapter() {
        super(R.layout.item_message_system);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder holder, @NotNull String data) {
        holder.setText(R.id.tv_title, data);
        holder.setText(R.id.tv_time, "2022-06-23 04:25");
        holder.setText(R.id.tv_content, "系统升级维护通知：平台将于凌晨12:00-4:00进行系统维护，感谢您的理解与支持！");

    }
}
