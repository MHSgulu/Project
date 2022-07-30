package com.kt.project.hwds.adapter;


import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.kt.project.R;

import org.jetbrains.annotations.NotNull;


public class MessageInvitedAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

    public MessageInvitedAdapter() {
        super(R.layout.item_message_invited);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder holder, @NotNull String data) {
        holder.setText(R.id.tv_title, "邀请好友成功");
        holder.setText(R.id.tv_time, "2022-06-23 04:25");
        holder.setText(R.id.tv_content, data);

    }
}
