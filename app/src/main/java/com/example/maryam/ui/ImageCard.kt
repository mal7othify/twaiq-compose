package com.example.maryam

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.maryam.data.domain.ImageData
import com.example.maryam.ui.imageslist.NetworkImage

@Composable
fun ImageCard(image: ImageData) {
  Card(
    elevation = 5.dp, shape = MaterialTheme.shapes.medium, modifier = Modifier.padding(8.dp)
  ) {
    Box {
      NetworkImage(
        url = image.downloadUrl,
        contentDesc = null,
        modifier = Modifier.size(200.dp)
      )
      Text(
        text = image.author.uppercase(),
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