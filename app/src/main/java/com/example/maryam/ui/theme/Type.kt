package com.example.maryam.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.maryam.R

val fontFamily = FontFamily(
  Font(R.font.cairo, FontWeight.Normal)
)

// Set of Material typography styles to start with
val Typography = Typography(
  body1 = TextStyle(
    fontFamily = FontFamily.Default, fontWeight = FontWeight.Bold, fontSize = 16.sp
  ),
  subtitle2 = TextStyle(
    shadow = Shadow(Color(0xFF000000)),
    textAlign = TextAlign.Center,
    fontFamily = fontFamily,
    letterSpacing = 0.50.sp,
    fontSize = 20.sp,
  )
)