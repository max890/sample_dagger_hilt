package com.example.network.di

import com.example.network.RestClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import javax.inject.Named
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module(includes = [HttpModule::class])
object RestClientModule {

    @Provides
    @Singleton
    fun provideRetrofit(
        httpClient: OkHttpClient,
        @Named(HttpModule.NAMED_BASE_URL) baseUrl: HttpUrl
    ): RestClient {
        return RestClient(
            baseUrl,
            httpClient
        )
    }
}