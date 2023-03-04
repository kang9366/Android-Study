package com.sgkang.androidessential_retrofit

import com.google.gson.annotations.SerializedName

data class UserInfo(
    @SerializedName("login")
    val id: String,
    val name: String,
    val created_at: String,
    val updated_at: String,
    val followers: Int,
    val following: Int
)