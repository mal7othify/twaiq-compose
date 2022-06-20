package com.example.maryam.di

import com.example.maryam.common.Constants
import com.example.maryam.data.domain.PicsumApi
import com.example.maryam.data.repository.ImageRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

  // API impl
  @Provides
  @Singleton
  fun providePicsumApi(): PicsumApi {
    return Retrofit.Builder()
      .baseUrl(Constants.BASE_URL)
      .addConverterFactory(GsonConverterFactory.create())
      .build()
      .create(PicsumApi::class.java)
  }

  // repo
  @Provides
  @Singleton
  fun provideRepo(api: PicsumApi): ImageRepository {
    return ImageRepository(picsumApi = api)
  }
}