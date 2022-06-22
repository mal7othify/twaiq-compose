package com.example.maryam.ui.imageslist

import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.GridItemSpan
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.maryam.ImageCard

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ImagesScreen(viewModel: ImagesViewModel = hiltViewModel()) {
  val state = viewModel.state.value
  Surface(
    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.secondary
  ) {
    if (state.isLoading || state.error.isNotEmpty()) {
      Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
      ) {
        if (state.isLoading) CircularProgressIndicator()
        if (state.error.isNotEmpty()) Text(text = state.error)
      }
    } else {
      LazyVerticalGrid(
        cells = GridCells.Adaptive(150.dp), modifier = Modifier.padding(16.dp)
      ) {
        item(span = { GridItemSpan(4) }) {
          Text(text = "My lovely app")
        }
        items(state.images) { picture ->
          Log.e("ImagesScreen", "${state.images}")
          ImageCard(image = picture)
        }
      }
    }
  }
}
