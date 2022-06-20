package com.example.maryam.ui.imageslist

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.GridItemSpan
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.maryam.ImageCard

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ImagesScreen(viewModel: ImagesViewModel = hiltViewModel()) {
  Surface(
    modifier = Modifier.fillMaxSize(),
    color = MaterialTheme.colors.secondary
  ) {
    LazyVerticalGrid(
      cells = GridCells.Adaptive(150.dp),
      modifier = Modifier.padding(16.dp)
    ) {
      item(
        span = { GridItemSpan(4) }
      ) {
        Text(text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ")
      }
      items(viewModel.getImages()) { picture ->
        ImageCard(image = picture)
      }
    }
  }
}