package com.example.windows10timt.handmadewatch.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.windows10timt.handmadewatch.activity.BaseActivity;
import com.example.windows10timt.handmadewatch.utils.Const;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Windows 10 TIMT on 2/27/2018.
 */

public abstract class BaseFragment extends Fragment {
    protected BaseActivity mActivity;
    protected View mView;
    private Unbinder unbinder;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivity = (BaseActivity) getActivity();
    }


    protected void showProgressDialog(String message) {
        mActivity.showProgressDialog(message);
    }

    protected void showProgressDialog(int messageId) {
        mActivity.showProgressDialog(messageId);
    }

    protected void hideProgressDialog() {
        mActivity.hideProgressDialog();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mView = inflater.inflate(getLayoutId(), container, false);
        unbinder = ButterKnife.bind(this, mView);
        createView(mView);
        return mView;
    }

    public void goToActivity(Class c) {
        Intent intent = new Intent(mActivity, c);
        startActivity(intent);
    }

    public void goToActivity(Class c, Bundle bundle) {
        Intent intent = new Intent(mActivity, c);
        intent.putExtra(Const.KEY_EXTRA_DATA, bundle);
        startActivity(intent);
    }

    protected abstract int getLayoutId();

    protected abstract void createView(View view);

}