package com.arabam.android.assigment.data.dto

import com.google.gson.annotations.SerializedName

data class Sort(
    @SerializedName("sortType")
    val sortType: Int,
    @SerializedName("sortDirections")
    val sortDirections: Int
)
