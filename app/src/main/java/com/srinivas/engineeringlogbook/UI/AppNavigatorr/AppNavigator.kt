package com.srinivas.engineeringlogbook.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.*

@Composable
fun AppNavigator() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "login"
    ) {

        composable("login") {
            LoginScreen(navController)
        }}

        composable("home") {
            composable("home") {
                HomeScreen()
            }
        }
    }
}