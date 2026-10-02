package com.gas.pam_p3

import android.R.attr.text
import android.R.attr.top
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TataletakColumn(modifier: Modifier){
    Column(modifier = modifier.padding(
        top = 20.dp,
        start = 20.dp,
        end = 20.dp
    )) {
        Text(text = "komponen1")
        Text(text = "komponen2")
        Text(text = "komponen3")
        Text(text = "komponen4")
    }
}

@Composable
fun TataletakRow(modifier: Modifier){
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ){
        Text(text = "komponen1")
        Text(text = "komponen2")
        Text(text = "komponen3")
        Text(text = "komponen4")
    }
}

@Composable
fun TataletakBox(modifier: Modifier){
    Box(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        contentAlignment = Alignment.Center
    ){
        Text(text = "Box 1")
        Text(text = "Column 1")
        Text(text = "Row 1")
        Text(text = "Box 2")
        Text(text = "Column 2")
    }
}

@Composable
fun TataletakColumRow(modifier: Modifier){

}