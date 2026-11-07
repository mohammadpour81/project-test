package com.example.a.navigation

import android.R.attr.type
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.a.ui.theme.screen.DigiScreen
import com.example.a.ui.theme.screen.HomeScreen
import com.example.a.ui.theme.screen.LoginScreen
import com.example.a.ui.theme.screen.ProfileScreen

@Composable
fun SetupNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screens.Home.route
    ) {
        composable(
            route = Screens.Home.route,
        ) { HomeScreen(navController) }

        composable(
            route = Screens.Digi.routeWithArgs("0:index"),
            arguments = listOf(
                navArgument("0") {
                    type = NavType.StringType
                    defaultValue = "0"
                }
            )
        ) {
            val index = it.arguments?.getString("0") ?: ""
            DigiScreen(index)
        }
    }
}