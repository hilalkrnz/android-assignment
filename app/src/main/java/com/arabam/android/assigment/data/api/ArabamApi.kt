package com.arabam.android.assigment.data.api

import com.arabam.android.assigment.data.dto.DetailResponse
import com.arabam.android.assigment.data.dto.ListResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ArabamApi {


    @GET("/api/v1/listing")
    suspend fun getListing(
        @Query("take") take: Int,
        @Query("sort") sort: Int?,
        @Query("sortDirection") sortDirection: Int?
    ): ListResponse

    @GET("/api/v1/listing")
    suspend fun getListingBy(
        @Query("categoryId") categoryId: Int?,
        @Query("minDate") minDate: String?,
        @Query("maxDate") maxDate: String?,
        @Query("minYear") minYear: Int?,
        @Query("maxYear") maxYear: Int?,
        @Query("sort") sort: Int?,
        @Query("sortDirection") sortDirection: Int?,
        @Query("skip") skip: Int?,
        @Query("take") take: Int
    ): ListResponse

    @GET("/api/v1/detail")
    suspend fun getDetailById(
        @Query("id") id: Int
    ): DetailResponse
}