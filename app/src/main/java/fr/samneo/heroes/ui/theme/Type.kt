package fr.samneo.heroes.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import fr.samneo.heroes.R

val Cabin = FontFamily(
    Font(R.font.cabin_regular, weight = FontWeight.Normal),
    Font(R.font.cabin_bold, weight = FontWeight.Bold)
)

// Set of Material typography styles to start with
val Typography = Typography(
    titleMedium = TextStyle(
        fontFamily = Cabin,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
    ),
    bodyMedium = TextStyle(
        fontFamily = Cabin,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
    ),
    displayLarge = TextStyle(
        fontFamily = Cabin,
        fontWeight = FontWeight.Normal,
        fontSize = 30.sp,
    ),
)