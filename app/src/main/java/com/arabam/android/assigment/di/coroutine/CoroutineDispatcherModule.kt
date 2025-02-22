package com.arabam.android.assigment.di.coroutine

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.Dispatchers
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CoroutineDispatcherModule {

    @IoDispatcher
    @Provides
    @Singleton
    fun providesIoDispatcher() = Dispatchers.IO
}