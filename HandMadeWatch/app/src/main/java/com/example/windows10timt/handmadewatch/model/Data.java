package com.example.windows10timt.handmadewatch.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Windows 10 TIMT on 3/16/2018.
 */

public class Data {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("price")
    @Expose
    private Integer price;
    @SerializedName("updated_by")
    @Expose
    private String updatedBy;
    @SerializedName("created_by")
    @Expose
    private String createdBy;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("sale_price")
    @Expose
    private Integer salePrice;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("sale_active")
    @Expose
    private String saleActive;
    @SerializedName("active")
    @Expose
    private String active;
    @SerializedName("likes_count")
    @Expose
    private String likesCount;
    @SerializedName("comments_count")
    @Expose
    private String commentsCount;
    @SerializedName("favorite_count")
    @Expose
    private String favoriteCount;
    @SerializedName("media")
    @Expose
    private List<Media> media = null;
    @SerializedName("liked")
    @Expose
    private List<Liked> liked = null;
    @SerializedName("favorited")
    @Expose
    private List<Favorited> favorited = null;
    @SerializedName("categories")
    @Expose
    private List<Category> categories = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Integer salePrice) {
        this.salePrice = salePrice;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getSaleActive() {
        return saleActive;
    }

    public void setSaleActive(String saleActive) {
        this.saleActive = saleActive;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(String likesCount) {
        this.likesCount = likesCount;
    }

    public String getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(String commentsCount) {
        this.commentsCount = commentsCount;
    }

    public String getFavoriteCount() {
        return favoriteCount;
    }

    public void setFavoriteCount(String favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public List<Media> getMedia() {
        return media;
    }

    public void setMedia(List<Media> media) {
        this.media = media;
    }

    public List<Liked> getLiked() {
        return liked;
    }

    public void setLiked(List<Liked> liked) {
        this.liked = liked;
    }

    public List<Favorited> getFavorited() {
        return favorited;
    }

    public void setFavorited(List<Favorited> favorited) {
        this.favorited = favorited;
    }

    public List<Category> getCategories() {
        return categories;
    }


}
