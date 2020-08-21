package com.example.network.di

import com.example.network.BuildConfig
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import okhttp3.OkHttpClient
import javax.inject.Named
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
object HttpModule {

    const val NAMED_BASE_URL: String = "qualifier_base_url"

    @Named(NAMED_BASE_URL)
    @Provides
    fun provideBaseUrl(): String {
        return BuildConfig.BASE_URL
    }


    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient {
        val builder = OkHttpClient.Builder()
        return builder
            .build()
    }
}