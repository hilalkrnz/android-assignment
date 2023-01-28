package com.arabam.android.assigment.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.arabam.android.assigment.domain.model.ArabamUiData
import com.arabam.android.assigment.domain.repository.ArabamRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val arabamRepository: ArabamRepository
) : ViewModel() {

    /* private val _arabamHomeUiState = MutableLiveData<HomeUiState>()
     val arabamHomeUiState: LiveData<HomeUiState> get() = _arabamHomeUiState*/


    /* suspend fun getListing(sort: Int?, sortDirection: Int?) {
         arabamRepository.getListing(sort, sortDirection).cachedIn(viewModelScope)
     }*/


    fun getListing(sort: Int?, sortDirection: Int?): Flow<PagingData<ArabamUiData>> {
        return arabamRepository.getListing(sort, sortDirection)
            .cachedIn(viewModelScope)
    }

    /* fun getListing(sort: Int?, sortDirection: Int?) = Pager(PagingConfig(5)) {
         ListPagingDataSource(arabamApi, sort, sortDirection)
     }.flow.cachedIn(viewModelScope)*/


    /*fun getListing(sort: Int?, sortDirection: Int?) {
        viewModelScope.launch {
            getListingUseCase(sort, sortDirection).collectLatest {
                when(it) {
                    is NetworkResponseState.Error -> {
                        _arabamHomeUiState.postValue(HomeUiState.Error(R.string.error))
                    }
                    NetworkResponseState.Loading ->{
                        _arabamHomeUiState.postValue(HomeUiState.Loading)
                    }
                    is NetworkResponseState.Success -> {
                        _arabamHomeUiState.postValue(HomeUiState.Success(it.map(it.result)))
                    }

                }
            }
        }

    }*/


}