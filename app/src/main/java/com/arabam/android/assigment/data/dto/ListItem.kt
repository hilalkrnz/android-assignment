package com.arabam.android.assigment.data.dto


import com.google.gson.annotations.SerializedName

data class ListItem(
    @SerializedName("category")
    val category: Category?,
    @SerializedName("date")
    val date: String?,
    @SerializedName("dateFormatted")
    val dateFormatted: String?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("location")
    val location: Location?,
    @SerializedName("modelName")
    val modelName: String?,
    @SerializedName("photo")
    val photo: String?,
    @SerializedName("price")
    val price: Int?,
    @SerializedName("priceFormatted")
    val priceFormatted: String?,
    @SerializedName("properties")
    val properties: List<Property>?,
    @SerializedName("title")
    val title: String?
)