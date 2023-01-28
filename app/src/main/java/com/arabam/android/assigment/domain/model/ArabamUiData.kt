package com.arabam.android.assigment.domain.model

import android.os.Parcelable
import com.arabam.android.assigment.data.dto.Location
import com.arabam.android.assigment.data.dto.Property
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue

@Parcelize
data class ArabamUiData(
    val imageUrl: String?,
    val year: @RawValue List<Property>?,
    val city: @RawValue Location?,
    val model: String?,
    val price: String?
) : Parcelable
