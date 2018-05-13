package com.example.windows10timt.handmadewatch.sevice;

/**
 * Created by Windows 10 TIMT on 3/12/2018.
 */

public class ApiUtil {
    public ApiUtil() {

    }
    public static final String BASE_URL = "http://handmadewatch.libre.com.vn/";

    public static APIService getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }

}
