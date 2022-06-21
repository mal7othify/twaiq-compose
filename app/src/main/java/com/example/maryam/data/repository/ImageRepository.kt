package com.example.maryam.data.repository

import com.example.maryam.common.Response
import com.example.maryam.data.domain.ImageData
import com.example.maryam.data.domain.PicsumApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class ImageRepository @Inject constructor(
  private val picsumApi: PicsumApi
) {

  suspend fun getImages(): List<ImageData> {
    return picsumApi.getImages()
  }

  fun getAllImages(): Flow<Response<List<ImageData>>> = flow {
    try {
      emit(Response.Loading<List<ImageData>>())
      val images = getImages()
      emit(Response.Success<List<ImageData>>(images))
    } catch (e: HttpException) {
      emit(
        Response.Error<List<ImageData>>(
          e.localizedMessage ?: "There is something wrong \uD83D\uDE22"
        )
      )
    } catch (e: IOException) {
      emit(Response.Error<List<ImageData>>("Failed to connect to server \uD83D\uDE22"))
    }
  }
}