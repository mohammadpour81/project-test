package com.example.a.navigationButton

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BtmNavScreen(val route: String, val title: String, val icon: ImageVector) {
    object Home : BtmNavScreen("home", "خانه", Icons.Default.Home)
    object Search : BtmNavScreen("search", "جستجو", Icons.Default.Search)
    object Profile : BtmNavScreen("profile", "پروفایل", Icons.Default.Person)

    companion object {
        //چرا داخل این؟ چون با صدا زدن BtmNavScreen بتونم خیلی راحت به این متغیره btmNavItems دسترسی داشته باشم
        val btmNavItems = listOf(Home, Search, Profile)
    }
}