package com.arabam.android.assigment.data.dto

import com.google.gson.annotations.SerializedName

data class DetailResponse(
    @SerializedName("data")
    val data : DetailItem,
    @SerializedName("status")
    val status : Int
)
