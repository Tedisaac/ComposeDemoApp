package com.ted.demoapp.ui.example

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun firstCardComposable(text: String, drawable: Int){
    Card {
        var expanded by remember {
            mutableStateOf(false)
        }
        Column(Modifier.clickable { expanded = !expanded }) {
            Image(painter = painterResource(id = drawable), contentDescription = "")
            AnimatedVisibility(visible = expanded) {
                Text(
                    text = text,
                    style = MaterialTheme.typography.h2
                )
            }
        }
    }
}

@Composable
fun firstButtonComposable(text: String){
    Button(
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.outlinedButtonColors(
        contentColor = Color.Blue,
        ),
        shape = RoundedCornerShape(10.dp),
        border =  BorderStroke(1.dp, Color.Blue),
    ) {
        Text(
            text = text,
            color = Color.Black,
            style = MaterialTheme.typography.body2)
    }
}
