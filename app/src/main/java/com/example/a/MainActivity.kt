package com.example.a

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SetUi()
        }
    }
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun SetUi(){
        Column (
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            TestButton()
            DigiButton()
            SnappButton()
        }
    }
    @Preview(
        showBackground = true,
        name = "Test",
        //widthDp = 400,
        //heightDp = 500,
        showSystemUi = true,
        //device = Devices.PIXEL_2
    )
    @Composable
    fun TestPreview() {
        SetUi()
    }

    @Composable
    fun TestButton(){
        Button({
            val intent= Intent(this@MainActivity, LoginActivity::class.java)
            startActivity(intent)
        }) {
            Text("Test")
        }
    }
    
    @Composable
    fun DigiButton(){
        Button({
            val intent= Intent(this@MainActivity, DigikalaActivity::class.java)
            startActivity(intent)
        }) {
            Text("DigiKala")
        }
    }

    @Composable
    fun SnappButton(){
        Button({
            val intent= Intent(this@MainActivity, SnappActivity::class.java)
            startActivity(intent)
        }) {
            Text("Snapp")
        }
    }

}



