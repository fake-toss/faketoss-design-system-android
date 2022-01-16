package land.sungbin.faketoss.ftds.android.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.graphics.Color

val FTossBlue = Color(0xFF0064FF)
val FTossColors
    @Composable
    @ReadOnlyComposable
    get() = MaterialTheme.colors.copy(primary = FTossBlue)
