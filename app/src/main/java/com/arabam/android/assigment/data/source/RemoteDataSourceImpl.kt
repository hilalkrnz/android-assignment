package com.arabam.android.assigment.data.source

import com.arabam.android.assigment.data.NetworkResponseState
import com.arabam.android.assigment.data.api.ArabamApi
import com.arabam.android.assigment.data.dto.DetailItem
import com.arabam.android.assigment.data.dto.ListItem
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(private val arabamApi: ArabamApi): RemoteDataSource {

    override suspend fun getListing(
        take: Int,
        sort: Int?,
        sortDirections: Int?
    ): NetworkResponseState<List<ListItem>>  =
        try {
            val response = arabamApi.getListing(take, sort, sortDirections)
            NetworkResponseState.Success(response.data)
        }catch (e: Exception) {
            NetworkResponseState.Error(e)
        }

    override suspend fun getDetailById(id: Int): NetworkResponseState<DetailItem> =
        try {
            val response = arabamApi.getDetailById(id)
            NetworkResponseState.Success(response.data)
        }catch (e: Exception) {
            NetworkResponseState.Error(e)
        }
}