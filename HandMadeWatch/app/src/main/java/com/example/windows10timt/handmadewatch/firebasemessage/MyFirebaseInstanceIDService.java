package com.example.windows10timt.handmadewatch.firebasemessage;

import android.util.Log;

import com.example.windows10timt.handmadewatch.model.SimpleClass;
import com.example.windows10timt.handmadewatch.sevice.APIService;
import com.example.windows10timt.handmadewatch.sevice.ApiUtil;
import com.example.windows10timt.handmadewatch.utils.Const;
import com.example.windows10timt.handmadewatch.utils.Libs_System;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Windows 10 TIMT on 3/22/2018.
 */

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {
    private static final String TAG = "MyFirebaseInstanceIDService";

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        // Get updated InstanceID token.
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Refreshed token: " + refreshedToken);

        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // Instance ID token to your app server.
        sendRegistrationToServer(refreshedToken);
    }

    /**
     * Persist token to third-party servers.
     * <p>
     * Modify this method to associate the user's FCM InstanceID token with any server-side account
     * maintained by your application.
     *
     * @param token The new token.
     */
    private void sendRegistrationToServer(String token) {
      /*  HMWApi api = new HMWApi();
        api.service().sendFCMToken("Bearer " + Libs_System.getStringData(getBaseContext(), HMW_Constant.TOKEN), "application/json", token, "android", new Callback<SimpleClass>() {
                @Override
                public void success(SimpleClass simpleClass, Response response) {
                    Log.e("send FCM token done",simpleClass.getDescription());
                }

                @Override
                public void failure(RetrofitError error) {
                Log.e("send FCM token error",error.toString());
            }
        });*/
        APIService apiService = ApiUtil.getAPIService();
        apiService.sendFCMToken("Bearer " + Libs_System.getStringData(getBaseContext(),
                Const.TOKEN), "application/json", token, "android").enqueue(new Callback<SimpleClass>() {
            @Override
            public void onResponse(Call<SimpleClass> call, Response<SimpleClass> response) {
                Log.e("send FCM token done", response.toString());
            }

            @Override
            public void onFailure(Call<SimpleClass> call, Throwable t) {
                Log.e("send FCM token error", call.toString());

            }
        });


    }
}
