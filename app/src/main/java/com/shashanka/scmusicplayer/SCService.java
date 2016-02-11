package com.shashanka.scmusicplayer;


import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;
/**
 * Created by Shashanka .
 */
public interface SCService {

    @GET("/tracks?client_id=" + Config.CLIENT_ID)
    public void getRecentTracks(@Query("created_at[from]") String date, Callback<List<Track>> cb);

    @GET("/tracks?client_id=" + Config.CLIENT_ID)
    public void searchTracks(@Query("q") String query, Callback<List<Track>> cb);

}
