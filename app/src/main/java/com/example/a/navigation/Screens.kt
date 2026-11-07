package com.example.a.navigation

sealed class Screens(val route: String) {
    object Login : Screens("login-screen")
    object Home : Screens("home-screen")
    object Digi : Screens("digi-screen")
    object Profile : Screens("profile-screen")

    fun routeWithArgs(vararg args: String) =
        buildString {
            append(route)
            args.forEachIndexed { index, _ ->
                append("?$index={$index}")
            }
        }


    fun paramsWithArgs(vararg args: String) =
        buildString {
            append(route)
            args.forEachIndexed { index, value ->
                append("?$index=$value")
            }
        }


    fun routeWithArgsMandatory(vararg args: String) =
        buildString {
            append(route)
            args.forEach {
                append("/{$it}")
            }
        }


    fun paramsWithArgsMandatory(vararg args: String) =
        buildString {
            append(route)
            args.forEach {
                append("/$it")
            }
        }

}