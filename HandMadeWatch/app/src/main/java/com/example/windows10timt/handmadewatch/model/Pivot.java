package com.example.windows10timt.handmadewatch.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Windows 10 TIMT on 3/16/2018.
 */

public class Pivot {
    @SerializedName("post_id")
    @Expose
    private String postId;
    @SerializedName("media_id")
    @Expose
    private String mediaId;

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }
}
