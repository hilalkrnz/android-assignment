package com.arabam.android.assigment.data.source

import androidx.paging.PagingData
import com.arabam.android.assigment.data.NetworkResponseState
import com.arabam.android.assigment.data.dto.DetailItem
import com.arabam.android.assigment.data.dto.ListItem
import kotlinx.coroutines.flow.Flow

interface RemoteDataSource {
    //TODO
    suspend fun getListing() : Flow<PagingData<ListItem>>

    suspend fun getDetailById(id: Int): NetworkResponseState<DetailItem>

}