package com.arabam.android.assigment.data.source

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.arabam.android.assigment.data.api.ArabamApi
import com.arabam.android.assigment.data.dto.ListItem

class ListPagingDataSource(
    private val arabamApi: ArabamApi,
    private val sort: Int?,
    private val sortDirection: Int?
) : PagingSource<Int, ListItem>() {


    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, ListItem> {
        val position = params.key ?: STARTING_TAKE_INDEX
        return try {
            val response = arabamApi.getListing(position, sort, sortDirection)
            LoadResult.Page(
                data = response.data!!,
                prevKey = if (position == STARTING_TAKE_INDEX) null else position.minus(ONE),
                nextKey = if (response.data.isEmpty()) null else position.plus(ONE)
            )
        } catch (e: Exception) {
            return LoadResult.Error(e)
        }
    }


    override fun getRefreshKey(state: PagingState<Int, ListItem>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            state.closestPageToPosition(anchorPosition)?.prevKey?.plus(ONE)
                ?: state.closestPageToPosition(anchorPosition)?.nextKey?.minus(ONE)
        }
    }

    companion object {
        private const val STARTING_TAKE_INDEX = 1
        private const val ONE = 1
    }
}