package com.arabam.android.assigment.di.repository

import com.arabam.android.assigment.domain.repository.ArabamRepository
import com.arabam.android.assigment.data.repository.ArabamRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class ArabamRepositoryModule {

    @Binds
    @Singleton
    abstract fun bindRepository(arabamRepositoryImpl: ArabamRepositoryImpl): ArabamRepository
}