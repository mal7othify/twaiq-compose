package com.example.maryam

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import com.example.maryam.domain.ImageData

@Composable
fun ImageCard(image: ImageData) {
  Card(
    elevation = 5.dp, shape = MaterialTheme.shapes.medium, modifier = Modifier.padding(8.dp)
  ) {
    Box(
      modifier = Modifier.size(200.dp)
    ) {
      Image(
        bitmap = ImageBitmap.imageResource(id = image.photoPath),
        contentDescription = image.title,
        contentScale = ContentScale.Crop,
        modifier = Modifier.fillMaxSize()
      )
      Text(
        text = image.title.uppercase(),
        modifier = Modifier
          .align(Alignment.BottomCenter)
          .background(MaterialTheme.colors.primaryVariant.copy(alpha = 1f))
          .fillMaxWidth()
          .padding(4.dp),
        style = MaterialTheme.typography.subtitle2
      )
    }
  }
}