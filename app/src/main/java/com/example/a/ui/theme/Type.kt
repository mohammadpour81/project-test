package com.example.a.ui.theme

import android.content.Context
import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.a.R

val default: FontFamily = FontFamily.Default
val roosta: FontFamily = FontFamily(Font(R.font.roosta))
val serif: FontFamily = FontFamily.Serif

object Fonts {
    const val DEFAULT = "default"
    const val ROOSTA = "roosta"
    const val SERIF = "serif"
}

fun Typography(context: Context): Typography {
    val pref = context.getSharedPreferences("Settings", Context.MODE_PRIVATE)
    val font = pref.getString("font", Fonts.DEFAULT)
    return Typography(
        bodyLarge = TextStyle(
            fontFamily = when (font) {
                Fonts.DEFAULT ->default
                Fonts.ROOSTA ->roosta
                else -> serif
            },
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp,
            lineHeight = 24.sp,
            letterSpacing = 0.5.sp
        ),
        titleLarge = TextStyle(
            fontFamily = when (font) {
                Fonts.DEFAULT ->default
                Fonts.ROOSTA ->roosta
                else -> serif
            },
            fontWeight = FontWeight.Normal,
            fontSize = 22.sp,
            lineHeight = 28.sp,
            letterSpacing = 0.sp
        ),
        labelLarge = TextStyle(
            fontFamily = when (font) {
                Fonts.DEFAULT ->default
                Fonts.ROOSTA ->roosta
                else -> serif
            }
        )
    )
}


