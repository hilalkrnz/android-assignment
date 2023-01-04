package com.arabam.android.assigment.data.repository

import androidx.paging.PagingData
import com.arabam.android.assigment.data.dto.ListItem
import kotlinx.coroutines.flow.Flow

interface ArabamRepository {
    fun getListing(): Flow<PagingData<ListItem>>
}