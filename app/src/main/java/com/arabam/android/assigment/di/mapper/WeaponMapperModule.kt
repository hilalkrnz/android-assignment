package com.arabam.android.assigment.di.mapper

import com.arabam.android.assigment.data.dto.ListItem
import com.arabam.android.assigment.data.mapper.ArabamMapper
import com.arabam.android.assigment.data.mapper.ArabamUiDataMapperImpl
import com.arabam.android.assigment.domain.model.ArabamUiData
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class WeaponMapperModule {

    @Binds
    @Singleton
    abstract fun bindArabamDomainMapper(
        arabamUiDataMapperImpl: ArabamUiDataMapperImpl
    ): ArabamMapper<ListItem, ArabamUiData>
}