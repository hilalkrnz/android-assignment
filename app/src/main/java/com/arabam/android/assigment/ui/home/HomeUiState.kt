package com.arabam.android.assigment.ui.home

import androidx.annotation.StringRes
import androidx.paging.PagingData
import com.arabam.android.assigment.domain.model.ArabamUiData

sealed class HomeUiState {
    object Loading : HomeUiState()
    data class Error(@StringRes val message: Int) : HomeUiState()
    data class Success(val data: PagingData<ArabamUiData>) : HomeUiState()
}