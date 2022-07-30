package com.kt.project.hwds.adapter;


import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.kt.project.R;

import org.jetbrains.annotations.NotNull;


public class MessageCommissionAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

    public MessageCommissionAdapter() {
        super(R.layout.item_message_commission);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder holder, @NotNull String data) {
        holder.setText(R.id.tv_title, "佣金已到账");
        holder.setText(R.id.tv_time, "2022-06-23 04:25");
        holder.setText(R.id.tv_content, "您的好友购买商品【秦妈妈重庆火锅2-3人套餐】分佣已到账");

    }
}
