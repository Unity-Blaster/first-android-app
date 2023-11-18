package com.blasterunity.firstapp.studioandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.blasterunity.firstapp.studioandroid.ui.theme.UnityBlastersAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            UnityBlastersAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    UnityBlastersAppTheme {
        Greeting("Android")
    }
}

fun main() {
    val developer = "Unity Blaster"
    println("Hey ${developer}!")
    println("If you are seeing this,")
    println("Your app Works!")
}

@Composable
fun Text(name: String) {
    val developer = "Unity Blaster"
    Text("Hey ${developer}!")
    Text("If you are seeing this,")
    Text("Your app Works!")
}
