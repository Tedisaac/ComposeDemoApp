package com.ted.demoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ted.demoapp.ui.example.firstButtonComposable
import com.ted.demoapp.ui.example.firstCardComposable
import com.ted.demoapp.ui.theme.DemoAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DemoAppTheme {
                // A surface container using the 'background' color from the theme
              Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    //firstCardComposable(text = "JetPack Compose", R.drawable.compose)
                    firstButtonComposable(text = "Red Ginger")
                }
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun DefaultPreview(){
    Column(
        modifier = Modifier
            .size(width = 100.dp, height = 100.dp)
            .padding(10.dp)
            .padding(2.dp)
            .fillMaxWidth(1f),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Button(
            onClick = { /*TODO*/ },
            Modifier.height(50.dp)
                .padding(top = 10.dp),
            border = BorderStroke(1.dp, Color.Blue),
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = Color.Cyan
            )
        ){
            Text(text = "Hey You!!")
        }
        Button(
            onClick = { /*TODO*/ },
            Modifier.height(50.dp)
                .padding(top = 10.dp),
            border = BorderStroke(1.dp, Color.Blue),
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = Color.Cyan
            )
        ){
            Text(text = "Hey You!!")
        }
    }

}






