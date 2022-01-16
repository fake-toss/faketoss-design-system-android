package land.sungbin.faketoss.ftds.preview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import land.sungbin.faketoss.ftds.android.component.button.ButtonType
import land.sungbin.faketoss.ftds.android.component.button.FTossButton
import land.sungbin.faketoss.ftds.android.theme.FTossBlue
import land.sungbin.faketoss.ftds.android.theme.FTossTheme
import land.sungbin.faketoss.ftds.preview.theme.SystemUiController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SystemUiController(window).setSystemBarsColor(color = FTossBlue)

        setContent {
            FTossTheme {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(vertical = 20.dp),
                    contentAlignment = Alignment.BottomCenter
                ) {
                    FTossButton(
                        onClick = { /*TODO*/ },
                        text = stringResource(R.string.app_name),
                        type = ButtonType.FOOTER
                    )
                }
            }
        }
    }
}
