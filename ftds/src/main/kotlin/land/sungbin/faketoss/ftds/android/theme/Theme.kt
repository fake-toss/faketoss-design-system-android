package land.sungbin.faketoss.ftds.android.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun FTossTheme(content: @Composable () -> Unit) {
    MaterialTheme(typography = FTossTypography, colors = FTossColors, shapes = FTossShapes) {
        content()
    }
}
