package com.example.windows10timt.handmadewatch.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Windows 10 TIMT on 3/16/2018.
 */

public class Likes {
    @SerializedName("creator")
    public Creator creator;
    public Creator getCreator() {
        return creator;
    }
}
