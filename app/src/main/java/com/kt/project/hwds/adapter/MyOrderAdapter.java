package com.kt.project.hwds.adapter;


import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.kt.project.R;

import org.jetbrains.annotations.NotNull;


public class MyOrderAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

    public MyOrderAdapter() {
        super(R.layout.item_order);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder holder, @NotNull String data) {
        holder.setText(R.id.tv_no, "订单号：123456789");
        holder.setText(R.id.tv_status, "待支付");
        holder.setText(R.id.tv_content, "中餐厅烤肉大餐3-4人套餐中餐厅烤肉大餐");

    }
}
