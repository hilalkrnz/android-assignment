package com.arabam.android.assigment.domain.usecase

import com.arabam.android.assigment.domain.repository.ArabamRepository
import javax.inject.Inject

class GetListingUseCase @Inject constructor(
    private val arabamRepository: ArabamRepository
) {
    operator fun invoke(
        sort: Int?,
        sortDirection: Int?
    ) = arabamRepository.getListing(sort, sortDirection)
}