package com.arabam.android.assigment.data.dto

import com.google.gson.annotations.SerializedName

data class ListResponse(
    @SerializedName("data")
    val data : List<ListItem>,
    @SerializedName("status")
    val status : Int
)
