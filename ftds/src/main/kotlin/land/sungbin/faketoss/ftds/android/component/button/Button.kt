@file:Suppress("RedundantExplicitType")

package land.sungbin.faketoss.ftds.android.component.button

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import land.sungbin.faketoss.ftds.android.theme.FTossBlue
import land.sungbin.faketoss.ftds.android.theme.FTossShape

private val ButtonDefaultPadding = 20.dp
private val ButtonTextDefaultVerticalPadding = 3.dp

@Composable
fun FTossButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    text: String,
    fontSize: TextUnit = TextUnit.Unspecified,
    type: ButtonType
) {
    var buttonModifier = modifier
    buttonModifier = when (type) {
        ButtonType.FOOTER -> {
            buttonModifier
                .fillMaxWidth()
                .padding(horizontal = ButtonDefaultPadding)
        }
    }
    var textModifier: Modifier = Modifier
    textModifier = when (type) {
        ButtonType.FOOTER -> {
            textModifier.padding(vertical = ButtonTextDefaultVerticalPadding)
        }
    }
    Button(
        modifier = buttonModifier,
        shape = FTossShape,
        elevation = ButtonDefaults.elevation(0.dp, 0.dp, 0.dp, 0.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = FTossBlue),
        onClick = { onClick() }
    ) {
        Text(
            modifier = textModifier,
            text = text,
            style = TextStyle(color = Color.White, fontSize = fontSize)
        )
    }
}
