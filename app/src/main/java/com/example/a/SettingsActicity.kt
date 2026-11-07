package com.example.a

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a.ui.theme.ATheme
import com.example.a.ui.theme.Fonts

class SettingsActicity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ATheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        innerPadding
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(padding: PaddingValues) {

    Column(
        modifier = Modifier
            .padding(padding)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val default: FontFamily = FontFamily.Default
        val roosta: FontFamily = FontFamily(Font(R.font.roosta))
        val serif: FontFamily = FontFamily.Serif
        val context = LocalContext.current
        val pref = context.getSharedPreferences("Settings", Context.MODE_PRIVATE)

        val font = pref.getString("font", Fonts.DEFAULT)
        val fontFamily = when (font) {
            Fonts.DEFAULT -> default
            Fonts.ROOSTA -> roosta
            else -> serif
        }
        var stateFont by remember { mutableStateOf(fontFamily) }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button({
                stateFont = default
                pref.edit().run {
                    putString("font", Fonts.DEFAULT)
                    apply()
                }
            }) {
                Text("default")
            }
            Button({
                stateFont = roosta
                pref.edit().run {
                    putString("font", Fonts.ROOSTA)
                    apply()
                }
            }) {
                Text("roosta")
            }
            Button({
                stateFont = serif
                pref.edit().run {
                    putString("font", Fonts.SERIF)
                    apply()
                }
            }) {
                Text("serif")
            }
        }
        Spacer(Modifier.height(20.dp))
        Text(
            "Mohammadreza Mohammadpour",
            style = TextStyle(
                fontFamily = stateFont
            )
        )
    }

}
