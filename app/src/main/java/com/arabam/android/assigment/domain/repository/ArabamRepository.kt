package com.arabam.android.assigment.domain.repository

import androidx.paging.PagingData
import com.arabam.android.assigment.domain.model.ArabamUiData
import kotlinx.coroutines.flow.Flow

interface ArabamRepository {
    fun getListing(sort: Int?, sortDirection: Int?): Flow<PagingData<ArabamUiData>>
}