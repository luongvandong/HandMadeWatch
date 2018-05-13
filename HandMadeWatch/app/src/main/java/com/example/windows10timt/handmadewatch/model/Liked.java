package com.example.windows10timt.handmadewatch.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Windows 10 TIMT on 3/16/2018.
 */

public class Liked {
    @SerializedName("id")
    public String id;
    @SerializedName("content")
    public String content;
    @SerializedName("target_id")
    public String target_id;
    @SerializedName("target_type")
    public String target_type;
    @SerializedName("updated_by")
    public String updated_by;
    @SerializedName("created_by")
    public String created_by;
    @SerializedName("created_at")
    public String created_at;
    @SerializedName("updated_at")
    public String updated_at;
    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getTarget_id() {
        return target_id;
    }

    public String getTarget_type() {
        return target_type;
    }

    public String getUpdated_by() {
        return updated_by;
    }

    public String getCreated_by() {
        return created_by;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

}
