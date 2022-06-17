package ru.ey.samarin.bluetoothen.ui.common

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SimpleToolbar(title: String) {
    TopAppBar {
        Text(
            modifier = Modifier.padding(start = 16.dp),
            text = title
        )
    }
}