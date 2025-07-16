package org.example.project.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColors = lightColorScheme(
    primary = primaryGreen,
    onPrimary = onPrimaryLight,
    primaryContainer = primaryContainerGreen,
    onPrimaryContainer = onPrimaryContainerDark,
    secondary = secondaryBlue,
    onSecondary = onSecondaryLight,
    tertiary = tertiaryPurple,
    onTertiary = onTertiaryLight,
    background = AppBackgroundLight,
    onBackground = OnBackgroundDark,
    surface = AppSurfaceLight,
    onSurface = OnSurfaceDark,
    error = ErrorRed,
    onError = OnErrorLight)

private val DarkColors = darkColorScheme(
    primary = primaryContainerGreen, // Often, primary in dark is a lighter shade
    onPrimary = onPrimaryContainerDark,
    primaryContainer = primaryGreen,
    onPrimaryContainer = onPrimaryLight,
    secondary = Color(0xFF82B1FF), // Example lighter blue for dark theme
    onSecondary = Color.Black,
    tertiary = Color(0xFFCE93D8), // Example lighter purple for dark theme
    onTertiary = Color.Black,
    background = AppBackgroundDark,
    onBackground = OnBackgroundLight,
    surface = AppSurfaceDark,
    onSurface = OnSurfaceLight,
    error = ErrorRedDark,
    onError = OnErrorDark)

@Composable
fun AppTheme(
    useDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (useDarkTheme) {
        DarkColors
    } else {
        LightColors
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography, // We'll define this in Type.kt (optional)
        shapes = Shapes,       // We'll define this in Shape.kt (optional)
        content = content
    )
}