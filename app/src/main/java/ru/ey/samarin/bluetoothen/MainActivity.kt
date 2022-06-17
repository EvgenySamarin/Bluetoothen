package ru.ey.samarin.bluetoothen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ru.ey.samarin.bluetoothen.ui.theme.BluetoothenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BluetoothenTheme {
                // A surface container using the 'background' color from the theme
                Scaffold(modifier = Modifier.fillMaxSize(),
                    topBar = {
                        TopAppBar {
                            Text(
                                modifier = Modifier.padding(start = 16.dp),
                                text = "Bluetooth api sample with compose UI"
                            )
                        }
                    }
                ) {
                    ScanDevicesScreen {
                        goToListOfBluetoothDevices()
                    }
                }
            }
        }
    }

    private fun goToListOfBluetoothDevices() {
        // TODO: go to another fragment or activity
    }
}

@Composable
fun ScanDevicesScreen(
    onClick: () -> Unit,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(all = 16.dp),
        horizontalArrangement = Arrangement.Center,
    ) {
        Button(onClick = {
            onClick()
        }) {
            Text(text = "Find devices")
        }
    }
}