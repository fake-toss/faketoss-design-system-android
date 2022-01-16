<img src="https://user-images.githubusercontent.com/40740128/149664872-5021a834-4167-4b30-8de7-20d710e73f99.png" align="right" width="25%" />

# FTDS 

> **F**ake **T**oss **D**esign **S**ystem

Let's clone [TDS](https://youtu.be/pfKuEuufgdc) with Jetpack Compose!

```kotlin
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
```

---

# Download [![](https://img.shields.io/maven-central/v/land.sungbin/ftds)](https://search.maven.org/artifact/land.sungbin/ftds)

```groovy
implementation "land.sungbin:ftds:${version}"
```

> This is a very experimental feature and is currently under development.

# Usage

TODO
