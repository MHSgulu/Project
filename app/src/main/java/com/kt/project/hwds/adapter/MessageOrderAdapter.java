package com.kt.project.hwds.adapter;


import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.kt.project.R;

import org.jetbrains.annotations.NotNull;


public class MessageOrderAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

    public MessageOrderAdapter() {
        super(R.layout.item_message_order);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder holder, @NotNull String data) {
        holder.setText(R.id.tv_title, "订单支付成功");
        holder.setText(R.id.tv_time, "2022-06-23 04:25");
        holder.setText(R.id.tv_content, "您购买的火锅2-3人套餐已经支付成功。");

    }
}
