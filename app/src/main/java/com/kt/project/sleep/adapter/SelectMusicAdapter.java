package com.kt.project.sleep.adapter;


import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.kt.project.R;

import org.jetbrains.annotations.NotNull;


public class SelectMusicAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

    public SelectMusicAdapter() {
        super(R.layout.item_select_music);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder holder, @NotNull String data) {
        holder.setText(R.id.tv_title, data);

    }
}
