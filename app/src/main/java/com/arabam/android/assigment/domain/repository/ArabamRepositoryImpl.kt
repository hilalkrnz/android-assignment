package com.arabam.android.assigment.domain.repository

import androidx.paging.PagingData
import com.arabam.android.assigment.data.dto.ListItem
import com.arabam.android.assigment.data.repository.ArabamRepository
import com.arabam.android.assigment.data.source.RemoteDataSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ArabamRepositoryImpl @Inject constructor(
    private val remoteDataSource: RemoteDataSource
): ArabamRepository {

    override fun getListing(): Flow<PagingData<ListItem>> {
        TODO("Not yet implemented")
    }
}