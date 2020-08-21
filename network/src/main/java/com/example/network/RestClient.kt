package com.example.network

import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import retrofit2.Retrofit

class RestClient constructor(
    baseUrl: HttpUrl,
    httpClient: OkHttpClient
) {

    private var client: Retrofit

    fun get(): Retrofit = client

    init {
        val builder = Retrofit.Builder()
            .baseUrl(baseUrl)
            .client(httpClient)
        client = builder.build()
    }
}