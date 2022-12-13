package com.arabam.android.assigment.di

import com.arabam.android.assigment.data.api.ArabamApi
import com.arabam.android.assigment.utility.Contants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ArabamNetworkApi {

    @Provides
    @Singleton
    fun provideArabamApi(): ArabamApi {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ArabamApi::class.java)
    }
}