package com.example.maryam.ui

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.Preview
import com.example.maryam.ui.imageslist.ImagesScreen
import com.example.maryam.ui.theme.MaryamTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      MaryamTheme {
        window.statusBarColor =
          MaterialTheme.colors.primaryVariant.toArgb()
        ImagesScreen()
      }
    }
  }
}


@Preview(showBackground = true, showSystemUi = true, uiMode = UI_MODE_NIGHT_NO)
@Composable
fun DefaultPreview() {
  MaryamTheme {
    ImagesScreen()
  }
}