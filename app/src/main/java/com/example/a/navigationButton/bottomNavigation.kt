package com.example.a.navigationButton

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.a.ui.theme.BtmScreen.HomeScreen
import com.example.a.ui.theme.BtmScreen.ProfileScreen
import com.example.a.ui.theme.BtmScreen.SearchScreen

@Composable
fun BottomNavigationBar(navController: NavController) {
    NavigationBar() {//material3 برای کامپوزه

        val currentRoute =
            navController.currentBackStackEntryAsState()

        BtmNavScreen.btmNavItems.forEach { screen ->
            NavigationBarItem(
                selected = currentRoute.value?.destination?.route == screen.route,
                onClick = {
                    navController.navigate(screen.route) {
                        popUpTo(navController.graph.startDestinationId) { saveState = true }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                icon = { Icon(screen.icon, contentDescription = screen.title) },
                label = { Text(screen.title) }
            )
        }
    }
}

@Composable
fun SetupBottomNavigation(
    navController: NavHostController,
    paddingValues: PaddingValues
) {
    NavHost(
        navController = navController,
        startDestination = BtmNavScreen.Home.route,
        modifier = Modifier.padding(paddingValues)
    ) {
        composable(BtmNavScreen.Home.route) { HomeScreen() }
        composable(BtmNavScreen.Search.route) { SearchScreen() }
        composable(BtmNavScreen.Profile.route) { ProfileScreen() }
    }
}
