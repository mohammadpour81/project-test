package com.example.a.ui.theme.screen

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.R
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.a.model.Product
import com.example.a.navigation.Screens
import com.example.a.repository.local.FakeData

@Composable
fun HomeScreen(
    navController: NavHostController
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan)
    ) {
        items(FakeData.products.size) { index ->
            SampleItem(
                FakeData.products[index],
                navController,
                index.toString()
            )
        }
    }
}

@Composable
fun SampleItem(
    product: Product,
    navController: NavHostController,
    index: String
) {

    Row(
        Modifier
            .fillMaxWidth()
            .padding(12.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(Color.White)
            .clickable {
                navController.navigate(Screens.Digi.paramsWithArgs(index))
            }
    ) {
        Column() {
            Text(
                text = product.name,
                fontSize = 14.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(top = 10.dp, end = 10.dp),
                style = TextStyle(
                    textDirection = TextDirection.Rtl
                )
            )

            Spacer(Modifier.height(25.dp))

            Text(
                text = product.price,
                fontSize = 14.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(start = 10.dp),
            )
        }
        Box(
            modifier = Modifier
                .size(120.dp)
                .padding(10.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(Color(0xFFEBEBEB)),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(product.pic),
                contentDescription = null,
                modifier = Modifier.size(width = 70.dp, height = 100.dp)
            )
        }
    }


}