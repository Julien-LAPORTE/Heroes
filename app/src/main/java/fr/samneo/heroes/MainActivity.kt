package fr.samneo.heroes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import fr.samneo.heroes.ui.HeroesUi
import fr.samneo.heroes.ui.theme.HeroesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HeroesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    HeroesApp()
                }
            }
        }
    }
}

@Composable
fun HeroesApp(modifier: Modifier = Modifier) {
    TopAppBar { HeroesUi(modifier) }
}

@Preview(showBackground = true)
@Composable
fun HeroesAppPreview() {
    HeroesTheme {
        HeroesApp()
    }
}