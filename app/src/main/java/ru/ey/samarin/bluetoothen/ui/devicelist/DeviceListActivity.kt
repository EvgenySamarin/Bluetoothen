package ru.ey.samarin.bluetoothen.ui.devicelist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ru.ey.samarin.bluetoothen.ui.common.SimpleToolbar
import ru.ey.samarin.bluetoothen.ui.theme.BluetoothenTheme

class DeviceListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BluetoothenTheme {
                // A surface container using the 'background' color from the theme
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = { SimpleToolbar(title = "Device list") },
                ) {

                }
            }
        }
    }

    // TODO: запроси пермишн на список блютуз устройств и обработай его
}