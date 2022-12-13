package com.arabam.android.assigment.data.source

import com.arabam.android.assigment.data.NetworkResponseState
import com.arabam.android.assigment.data.dto.DetailItem
import com.arabam.android.assigment.data.dto.ListItem

interface RemoteDataSource {
    //TODO
    suspend fun getListing(take: Int, sort: Int?, sortDirections: Int?) : NetworkResponseState<List<ListItem>>

    // suspend fun getListingByDate()

    suspend fun getDetailById(id: Int): NetworkResponseState<DetailItem>

}