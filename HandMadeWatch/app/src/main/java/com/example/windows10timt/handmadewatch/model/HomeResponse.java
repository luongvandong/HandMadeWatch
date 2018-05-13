package com.example.windows10timt.handmadewatch.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Windows 10 TIMT on 3/16/2018.
 */

public class HomeResponse {
    @SerializedName("code")
    private String code;
    @SerializedName("data")
    private ArrayList<Data> dataArrayList;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ArrayList<Data> getDataArrayList() {
        return dataArrayList;
    }

    public void setDataArrayList(ArrayList<Data> dataArrayList) {
        this.dataArrayList = dataArrayList;
    }
}
