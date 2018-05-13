package com.example.windows10timt.handmadewatch.fragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Windows 10 TIMT on 3/16/2018.
 */

public class FragmentController {
    public static void replaceFragmentAndAddBackStack(Context mContext, Fragment fragment, String nameClass, int layoutId, String tag) {
        FragmentManager fragmentManager = ((AppCompatActivity) mContext).getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(layoutId, fragment, tag);
        fragmentTransaction.addToBackStack(nameClass);
        fragmentTransaction.commit();
    }

    public static void replaceFragment(Context mContext, Fragment fragment, int layoutId) {
        FragmentManager fragmentManager = ((AppCompatActivity) mContext).getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(layoutId, fragment);
        fragmentTransaction.commit();
    }

    public static void addFragmentAndAddBackStack(Context mContext, Fragment fragment, String nameClass, int layoutId) {
        FragmentManager fragmentManager = ((AppCompatActivity) mContext).getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(layoutId, fragment);
        fragmentTransaction.addToBackStack(nameClass);
        fragmentTransaction.commit();
    }

    public static void addFragment(Context mContext, Fragment fragment, int layoutId) {
        FragmentManager fragmentManager = ((AppCompatActivity) mContext).getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(layoutId, fragment);
        fragmentTransaction.commit();
    }
}
