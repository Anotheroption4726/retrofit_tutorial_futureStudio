package com.example.retrofit_tutorial_futurestudio;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {

    @GET("posts")
    Call<List<Post>> getPosts();

    @GET("posts/1")
    Call<Post> getPostsFromUserId_1();
}
