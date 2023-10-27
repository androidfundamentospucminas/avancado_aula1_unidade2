package com.walker.aula1unidade2androidavancado

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.walker.aula1unidade2androidavancado.ui.theme.Aula1Unidade2AndroidAvancadoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Aula1Unidade2AndroidAvancadoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CountSection()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column {
        Column {
            Text(
                text = "Hello $name!",
                modifier = modifier
            )
            Text(
                text = "Hello 2, $name!",
                modifier = modifier
            )
        }
        Row {
            Text(
                text = "Hello 3 $name!",
                modifier = modifier
            )
            Text(
                text = "Hello 4, $name!",
                modifier = modifier
            )
        }
    }
}

@Composable
fun CountSection() {
    var count by remember { mutableStateOf<Int>(0) }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Contador: $count")
        Button(onClick = {
            // Incrementar o contador
            count++
        }) {
            Text(text = "Incrementa +1")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Aula1Unidade2AndroidAvancadoTheme {
        CountSection()
    }
}