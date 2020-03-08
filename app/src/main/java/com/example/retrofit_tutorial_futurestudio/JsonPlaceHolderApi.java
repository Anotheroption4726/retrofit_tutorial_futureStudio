package com.example.retrofit_tutorial_futurestudio;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface JsonPlaceHolderApi {

    @GET("posts")
    Call<List<Post>> getPosts();

    @GET("posts/1")
    Call<Post> getPostsFromUserId_1();

    @GET("posts/2/comments")
    Call<List<Comment>> getComments();
}
