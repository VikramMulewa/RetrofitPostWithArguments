package com.example.vikram.retrofitpostwitharguments;


import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Vikram on 04-May-17.
 */

public interface ApInterface {
        @GET("fetch_list.php")
        Call<Model> getTasks();
        @FormUrlEncoded
        @POST("fetch_list.php")
        //wher model is response
        Call<Model> calbk(
                @Field("id") long id,
                @Field("timestamp") long timestamp
        );
}
