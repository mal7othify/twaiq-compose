package com.example.maryam.ui.imageslist

import com.example.maryam.data.domain.ImageData

data class ImageListState(
  val isLoading: Boolean = false,
  val error: String = "",
  val images: List<ImageData> = emptyList()
)
