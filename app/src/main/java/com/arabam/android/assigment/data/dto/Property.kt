package com.arabam.android.assigment.data.dto


import com.google.gson.annotations.SerializedName

data class Property(
    @SerializedName("name")
    val name: String?,
    @SerializedName("value")
    val value: String?
)