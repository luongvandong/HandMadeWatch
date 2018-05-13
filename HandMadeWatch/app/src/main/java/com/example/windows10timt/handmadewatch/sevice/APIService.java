package com.example.windows10timt.handmadewatch.sevice;

import com.example.windows10timt.handmadewatch.common.Post;
import com.example.windows10timt.handmadewatch.model.HomeResponse;
import com.example.windows10timt.handmadewatch.model.SimpleClass;
import com.example.windows10timt.handmadewatch.model.User;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

/**
 * Created by Windows 10 TIMT on 3/12/2018.
 */

public interface APIService {
    @GET("/api/post")
    Call<HomeResponse> getProductOnSale(@Query("type") String type);
    @GET("/api/user")
    Call<User> getUserInfo(@Header("Authorization") String token,@Header("Accept") String accept );
    @Multipart
    @POST("/lbpushcenter/api/device")
    Call<SimpleClass> sendTokenFristInstall(@Part("token") String device_id, @Part("application") String device_type);
    @Multipart
    @POST("/api/device")
    Call<SimpleClass> sendFCMToken(@Header("Authorization") String token, @Header("Accept")
            String accept, @Part("device_id") String device_id, @Part("device_type") String device_type);


}
