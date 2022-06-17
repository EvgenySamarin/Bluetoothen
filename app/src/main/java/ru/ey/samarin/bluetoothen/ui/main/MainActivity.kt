package ru.ey.samarin.bluetoothen.ui.main

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ru.ey.samarin.bluetoothen.ui.common.SimpleToolbar
import ru.ey.samarin.bluetoothen.ui.devicelist.DeviceListActivity
import ru.ey.samarin.bluetoothen.ui.theme.BluetoothenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BluetoothenTheme {
                // A surface container using the 'background' color from the theme
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = { SimpleToolbar(title = "Bluetooth api sample with compose UI") },
                ) {
                    ScanDevicesScreen {
                        goToListOfBluetoothDevices()
                    }
                }
            }
        }
    }

    private fun goToListOfBluetoothDevices() {
        Intent(this, DeviceListActivity::class.java).also {
            startActivity(it)
        }
    }
}