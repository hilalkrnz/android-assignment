package com.arabam.android.assigment.data.repository

import androidx.paging.PagingData
import androidx.paging.map
import com.arabam.android.assigment.data.mapper.ArabamUiDataMapperImpl
import com.arabam.android.assigment.data.source.RemoteDataSource
import com.arabam.android.assigment.domain.model.ArabamUiData
import com.arabam.android.assigment.domain.repository.ArabamRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class ArabamRepositoryImpl @Inject constructor(
    private val remoteDataSource: RemoteDataSource,
    private val arabamUiDataMapper: ArabamUiDataMapperImpl,
    //@IoDispatcher private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) : ArabamRepository {
    override fun getListing(
        sort: Int?,
        sortDirection: Int?
    ): Flow<PagingData<ArabamUiData>> {
        return remoteDataSource.getListing(sort, sortDirection)
            .map {
                it.map {
                    arabamUiDataMapper.map(it)
                }
            }
    }


}