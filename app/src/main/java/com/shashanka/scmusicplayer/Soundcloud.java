package com.shashanka.scmusicplayer;


import retrofit.RestAdapter;
/**
 * Created by Shashanka .
 */
public class Soundcloud {
    private static final RestAdapter REST_ADAPTER = new RestAdapter.Builder().setEndpoint(Config.API_URL).build();
    private static final SCService SERVICE = REST_ADAPTER.create(SCService.class);

    public static SCService getService() {
        return SERVICE;
    }
}
