package com.example.windows10timt.handmadewatch.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Windows 10 TIMT on 3/22/2018.
 */

public class SimpleClass {
    @SerializedName("code")
    private String code;
    @SerializedName("description")
    private String description;

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
