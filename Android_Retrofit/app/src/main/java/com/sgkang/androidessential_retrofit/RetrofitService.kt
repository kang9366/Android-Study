package com.sgkang.androidessential_retrofit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface RetrofitService{
    @GET("users/{userId}")
    fun getUserInfo(@Path("userId") userId: String): Call<UserInfo>
}