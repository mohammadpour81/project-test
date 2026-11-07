package com.example.a.ui.theme.screen

import com.example.a.ui.theme.BlueMain
import com.example.a.ui.theme.GrayMain
import com.example.a.ui.theme.MagentaMain
import com.example.a.ui.theme.YellowMain
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a.R
import com.example.a.repository.local.FakeData


@Composable
fun DigiScreen(index: String) {

    val product = FakeData.products[index.toInt()]
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
            .background(Color.White)
    ) {

        Spacer(Modifier.height(30.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(2.dp)
                .padding(horizontal = 12.dp)
                .background(Color.Red)
        )

        Spacer(Modifier.height(40.dp))

        Image(
            painter = painterResource(product.pic),
            "",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        )

        Spacer(Modifier.height(30.dp))

        Text(
            text = product.name,
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 16.dp),
            textAlign = TextAlign.End,
            fontWeight = FontWeight.Bold
        )

        Spacer(Modifier.height(10.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.End
        ) {

            Text(
                text = "دیدگاه کاربران",
                fontSize = 14.sp,
                modifier = Modifier
                    .padding(end = 4.dp),
                color = BlueMain
            )

            Text(
                text = "8",
                fontSize = 14.sp,
                color = BlueMain
            )

            Box(
                Modifier
                    .padding(horizontal = 12.dp)
                    .size(5.dp)
                    .background(Color.Gray, shape = CircleShape)
            )

            Text(
                text = "(11)",
                fontSize = 14.sp,
                color = Color.Gray
            )

            Text(
                text = "4.2",
                fontSize = 14.sp,
                modifier = Modifier
                    .padding(end = 4.dp)
            )

            Icon(
                Icons.Default.Star,
                contentDescription = "",
                tint = YellowMain,
                modifier = Modifier
                    .padding(end = 14.dp)
                    .size(18.dp)
            )

        }

        Spacer(Modifier.height(30.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(8.dp)
                .background(GrayMain)
        )

        Spacer(Modifier.height(20.dp))

        Text(
            text = "ویژگی های محصول",
            fontSize = 18.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 16.dp),
            textAlign = TextAlign.End,
            fontWeight = FontWeight.Bold
        )

        Spacer(Modifier.height(10.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.End
        ) {

            Text(
                text = "آلمان",
                fontSize = 14.sp,
                modifier = Modifier
                    .padding(end = 4.dp)
            )

            Text(
                text = ":",
                fontSize = 14.sp,
                modifier = Modifier
                    .padding(end = 4.dp),
                color = Color.Gray
            )

            Text(
                text = "کشور تولید",
                fontSize = 14.sp,
                color = Color.Gray
            )

            Box(
                Modifier
                    .padding(start = 10.dp, end = 16.dp)
                    .size(5.dp)
                    .background(Color.Gray, shape = CircleShape)
            )

        }

        Spacer(Modifier.height(20.dp))

        Box(
            Modifier
                .padding(horizontal = 14.dp)
                .fillMaxWidth()
                .height(2.dp)
                .background(GrayMain)
        )

        Spacer(Modifier.height(15.dp))

        Row(
            Modifier.padding(horizontal = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Icon(
                painter = painterResource(R.drawable.arrow),
                contentDescription = "",
                tint = Color.Gray,
                modifier = Modifier.size(26.dp)
            )

            Text(
                text = "مشخصات فنی",
                fontSize = 16.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 8.dp),
                textAlign = TextAlign.End,
                fontWeight = FontWeight.Bold
            )

        }

        Spacer(Modifier.height(15.dp))

        Box(
            Modifier
                .padding(horizontal = 14.dp)
                .fillMaxWidth()
                .height(2.dp)
                .background(GrayMain)
        )

        Spacer(Modifier.height(15.dp))

        Row(
            Modifier.padding(horizontal = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Icon(
                painter = painterResource(R.drawable.arrow),
                contentDescription = "",
                tint = Color.Gray,
                modifier = Modifier.size(26.dp)
            )

            Text(
                text = "معرفی محصول",
                fontSize = 16.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 8.dp),
                textAlign = TextAlign.End,
                fontWeight = FontWeight.Bold
            )

        }

        Spacer(Modifier.height(20.dp))

        // Category Row
        Row(
            Modifier
                .fillMaxWidth()
                .background(GrayMain)
                .horizontalScroll(
                    rememberScrollState(),
                    reverseScrolling = true
                )
                .padding(10.dp)
        ) {

            for (item in 1..8) {

                Spacer(Modifier.width(10.dp))

                Card(
                    shape = CircleShape,
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    ),
                    elevation = CardDefaults.cardElevation(6.dp)
                ) {

                    Row(
                        modifier = Modifier.padding(10.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Icon(
                            painter = painterResource(R.drawable.arrow),
                            contentDescription = "",
                            tint = Color.Gray,
                            modifier = Modifier.size(26.dp)
                        )

                        Text(
                            text = "محصول تستی",
                            fontSize = 15.sp,
                            modifier = Modifier
                                .padding(end = 8.dp),
                            fontWeight = FontWeight.Bold
                        )

                    }

                }

            }

        }

        Spacer(Modifier.height(20.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                text = "نظر",
                fontSize = 14.sp,
                modifier = Modifier
                    .padding(end = 4.dp, start = 10.dp),
                color = BlueMain
            )

            Text(
                text = "8",
                fontSize = 14.sp,
                modifier = Modifier
                    .padding(end = 12.dp),
                color = BlueMain
            )

            Text(
                text = "دیدگاه کاربران",
                fontSize = 18.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 16.dp),
                textAlign = TextAlign.End,
                fontWeight = FontWeight.Bold
            )

        }

        Spacer(Modifier.height(20.dp))

        // Comment Row
        Row(
            Modifier
                .fillMaxWidth()
                .horizontalScroll(
                    rememberScrollState(),
                    reverseScrolling = true
                ),
            verticalAlignment = Alignment.CenterVertically
        ) {

            for (i in 1..8) {

                Spacer(Modifier.width(8.dp))

                Card(
                    modifier = Modifier.width(280.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    ),
                    elevation = CardDefaults.cardElevation(8.dp)
                ) {

                    Spacer(Modifier.height(20.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.End
                    ) {

                        Text(
                            text = "خریدار نیست",
                            fontSize = 14.sp,
                            modifier = Modifier
                                .padding(end = 6.dp),
                            color = Color.Gray
                        )

                        Icon(
                            Icons.Outlined.Person,
                            "",
                            tint = Color.Gray,
                            modifier = Modifier.padding(end = 16.dp)
                        )

                    }

                    Text(
                        text = "به نظرم خیلی خوب بود و یکی از تجربه های خفن من هست",
                        fontSize = 14.sp,
                        modifier = Modifier
                            .padding(end = 20.dp, start = 10.dp, top = 10.dp),
                        textAlign = TextAlign.End,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(Modifier.height(40.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.End
                    ) {

                        Text(
                            text = "علیرضا احمدی",
                            fontSize = 14.sp,
                            color = Color.Gray
                        )

                        Box(
                            Modifier
                                .padding(horizontal = 12.dp)
                                .size(5.dp)
                                .background(Color.Gray, shape = CircleShape)
                        )

                        Text(
                            text = "ده دقیقه قبل",
                            fontSize = 14.sp,
                            modifier = Modifier
                                .padding(end = 20.dp),
                            color = Color.Gray
                        )

                    }

                    Spacer(Modifier.height(15.dp))

                }

                Spacer(Modifier.width(8.dp))

            }

        }

        Spacer(Modifier.height(20.dp))

        Card(
            Modifier.fillMaxWidth(),
            shape = RectangleShape,
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            ),
            elevation = CardDefaults.cardElevation(12.dp)
        ) {

            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {

                Column {

                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Text(
                            text = product.price,
                            fontSize = 12.sp,
                            modifier = Modifier
                                .padding(end = 6.dp),
                            color = Color.Gray
                        )

                        Text(
                            text = "56 %",
                            fontSize = 12.sp,
                            modifier = Modifier
                                .background(
                                    MagentaMain,
                                    shape = CircleShape
                                )
                                .padding(4.dp),
                            color = Color.White
                        )

                    }

                    Spacer(Modifier.height(6.dp))

                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Text(
                            text = "تومان",
                            fontSize = 14.sp,
                            modifier = Modifier
                                .padding(end = 6.dp)
                        )

                        Text(
                            text = "97,000",
                            fontSize = 14.sp
                        )

                    }

                }

                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.CenterEnd
                ) {

                    Button(
                        onClick = {},
                        shape = RoundedCornerShape(12.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = MagentaMain
                        )
                    ) {
                        Text(
                            text = "افزودن به سبد خرید",
                            fontSize = 20.sp,
                            color = Color.White
                        )
                    }

                }

            }

        }

    }

}