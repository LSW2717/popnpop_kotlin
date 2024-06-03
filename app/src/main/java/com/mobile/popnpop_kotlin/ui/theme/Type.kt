package com.mobile.popnpop_kotlin.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.mobile.popnpop_kotlin.R

// Set of Material typography styles to start with

val GmarketSans = FontFamily(
    Font(R.font.gmarket_sans_bold, FontWeight.Bold),
    Font(R.font.gmarket_sans_medium, FontWeight.Medium),
    Font(R.font.gmarket_sans_light, FontWeight.Light)
)
val headerText1 = TextStyle(
    color = Color.Black,
    fontFamily = GmarketSans,
    fontSize = 22.sp,
    fontWeight = FontWeight.W400,
    letterSpacing = (-0.55).sp
)

val headerText2 = TextStyle(
    color = Color.Black,
    fontFamily = GmarketSans,
    fontSize = 20.sp,
    fontWeight = FontWeight.W400,
    letterSpacing = (-0.50).sp
)

val headerText3 = TextStyle(
    color = Color.Black,
    fontFamily = GmarketSans,
    fontSize = 18.sp,
    fontWeight = FontWeight.W400,
    letterSpacing = (-0.45).sp
)

val headerText4 = TextStyle(
    color = Color.Black,
    fontFamily = GmarketSans,
    fontSize = 17.sp,
    fontWeight = FontWeight.W400,
    letterSpacing = (-0.42).sp
)

val headerText5 = TextStyle(
    color = Color.Black,
    fontFamily = GmarketSans,
    fontSize = 16.sp,
    fontWeight = FontWeight.W400,
    letterSpacing = (-0.40).sp
)

val bodyText1 = TextStyle(
    color = Color.Black,
    fontFamily = GmarketSans,
    fontSize = 15.sp,
    fontWeight = FontWeight.W400,
    letterSpacing = (-0.38).sp
)

val bodyText2 = TextStyle(
    color = Color.Black,
    fontFamily = GmarketSans,
    fontSize = 14.sp,
    fontWeight = FontWeight.W400,
    letterSpacing = (-0.35).sp
)

val bodyText3 = TextStyle(
    color = Color.Black,
    fontFamily = GmarketSans,
    fontSize = 12.sp,
    fontWeight = FontWeight.W400,
    letterSpacing = (-0.30).sp
)

val bodyText4 = TextStyle(
    color = Color.Black,
    fontFamily = GmarketSans,
    fontSize = 11.sp,
    fontWeight = FontWeight.W400,
    letterSpacing = (-0.28).sp
)

val bodyText5 = TextStyle(
    color = Color.Black,
    fontFamily = GmarketSans,
    fontSize = 11.sp,
    fontWeight = FontWeight.W400,
    letterSpacing = (-0.28).sp
)

val bodyText6 = TextStyle(
    color = Color.Black,
    fontFamily = GmarketSans,
    fontSize = 28.sp,
    fontWeight = FontWeight.W400,
    letterSpacing = (-0.70).sp
)

val bodyText7 = TextStyle(
    color = Color.Black,
    fontFamily = GmarketSans,
    fontSize = 13.sp,
    fontWeight = FontWeight.W400,
    letterSpacing = (-0.33).sp
)

// Define the Typography object
val Typography = Typography(
    headlineLarge = headerText1,
    headlineMedium = headerText2,
    headlineSmall = headerText3,
    titleLarge = headerText4,
    titleMedium = headerText5,
    titleSmall = bodyText1,
    bodyLarge = bodyText2,
    bodyMedium = bodyText3,
    bodySmall = bodyText4,
    labelLarge = bodyText5,
    labelMedium = bodyText6,
    labelSmall = bodyText7
)
