package com.example.maryam.ui.imageslist

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.maryam.R
import com.example.maryam.data.domain.ImageData
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ImagesViewModel @Inject constructor(
  // Add classes
)  : ViewModel() {

  init {
    Log.e("ImagesViewModel", "This is inside init section")
  }

  fun getImages(): List<ImageData> {
    val images = mutableListOf<ImageData>(
      ImageData(
        photoPath = R.drawable.item_1,
        title = "قمر",
        id = 1
      ),
      ImageData(
        photoPath = R.drawable.item_2,
        title = "أشكال",
        id = 2
      ),
      ImageData(
        photoPath = R.drawable.item_3,
        title = "جبال",
        id = 3
      ),
      ImageData(
        photoPath = R.drawable.item_4,
        title = "جبال أخرى",
        id = 4
      ),
      ImageData(
        photoPath = R.drawable.item_2,
        title = "شتاء",
        id = 5
      ),
      ImageData(
        photoPath = R.drawable.item_6,
        title = "منزل",
        id = 6
      ),
      ImageData(
        photoPath = R.drawable.item_7,
        title = "رمادي",
        id = 7
      ),
      ImageData(
        photoPath = R.drawable.item_3,
        title = "صحراء",
        id = 8
      ),
    )
    return images
  }
}
