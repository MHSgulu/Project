package com.kt.project.sleep.dialog;


import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.kt.project.databinding.DialogSelectMusicBinding;

import org.jetbrains.annotations.NotNull;


public class SelectMusicDialogFragment extends DialogFragment {

    private DialogSelectMusicBinding binding;
    private Dialog dialog;
    private Window window;


    public static SelectMusicDialogFragment newInstance() {
        Bundle args = new Bundle();
        SelectMusicDialogFragment fragment = new SelectMusicDialogFragment();
        //args.putString(Constant.ARG, arg1);
        //args.putString(Constant.ID, arg2);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            //link = getArguments().getString(Constant.ARG, "");
            //goodsId = getArguments().getString(Constant.ID, "");
        }
    }

    @NotNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        dialog = super.onCreateDialog(savedInstanceState);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        //dialog.setCanceledOnTouchOutside(true); //设置点击Dialog外部任意区域关闭Dialog
        window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            window.setGravity(Gravity.BOTTOM);
        }
        //设置Dialog宽高的代码在此处无效
        return dialog;
    }

    @Override
    public void onStart() {
        //设置Dialog宽高的代码在此处有效
        super.onStart();
        if (dialog != null) {
            WindowManager.LayoutParams layoutParams = window.getAttributes();
            layoutParams.width = ViewGroup.LayoutParams.MATCH_PARENT;
            layoutParams.height = ViewGroup.LayoutParams.WRAP_CONTENT;
            window.setAttributes(layoutParams);
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = DialogSelectMusicBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

}