package com.arabam.android.assigment.data.source

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.arabam.android.assigment.data.NetworkResponseState
import com.arabam.android.assigment.data.api.ArabamApi
import com.arabam.android.assigment.data.dto.DetailItem
import com.arabam.android.assigment.data.dto.ListItem
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(
    private val arabamApi: ArabamApi
) : RemoteDataSource {

    override fun getListing(sort: Int?, sortDirecton: Int?): Flow<PagingData<ListItem>> =
        Pager(
            config = PagingConfig(
                pageSize = NETWORK_PAGE_SIZE,
                enablePlaceholders = false
            ),
            pagingSourceFactory = { ListPagingDataSource(arabamApi, sort, sortDirecton) }
        ).flow


    /* override suspend fun getDetailById(id: Int): NetworkResponseState<DetailItem> =
       safeApiCall { arabamApi.getDetailById(id) }*/

    override suspend fun getDetailById(id: Int): NetworkResponseState<DetailItem> =
        try {
            val response = arabamApi.getDetailById(id)
            NetworkResponseState.Success(response.data)
        } catch (e: Exception) {
            NetworkResponseState.Error(e)
        }

    companion object {
        const val NETWORK_PAGE_SIZE = 5
    }
}