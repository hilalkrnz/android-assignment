package com.arabam.android.assigment.data.mapper

import com.arabam.android.assigment.data.dto.ListItem
import com.arabam.android.assigment.domain.model.ArabamUiData
import javax.inject.Inject

class ArabamUiDataMapperImpl @Inject constructor() :
    ArabamUiDataMapper<ListItem, ArabamUiData> {

    override fun map(input: ListItem?):ArabamUiData {
        return ArabamUiData(
            imageUrl = input?.photo,
            year = input?.properties,
            city = input?.location,
            model = input?.modelName,
            price = input?.priceFormatted
        )
    }
}
