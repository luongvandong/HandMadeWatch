package com.example.windows10timt.handmadewatch.fragment;

import android.app.Dialog;
import android.app.DialogFragment;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.view.Window;

import butterknife.ButterKnife;

/**
 * Created by Windows 10 TIMT on 2/27/2018.
 */

public abstract class BaseDialogFragment extends DialogFragment {
    @RequiresApi(api = Build.VERSION_CODES.M)
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialog = new Dialog(getContext());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        View view = getActivity().getLayoutInflater().inflate(getLayoutId(), null);
        ButterKnife.bind(this, view);

        updateUI(view);

        dialog.setContentView(view);
        return dialog;

    }

    protected abstract int getLayoutId();

    protected abstract void updateUI(View view);
}