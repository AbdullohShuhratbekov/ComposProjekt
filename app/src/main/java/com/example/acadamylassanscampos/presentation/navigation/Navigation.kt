package com.example.acadamylassanscampos.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.acadamylassanscampos.presentation.screen.main.screens.MainEighthScreen
import com.example.acadamylassanscampos.presentation.screen.main.screens.MainFirstScreen
import com.example.acadamylassanscampos.presentation.screen.main.screens.MainFiveScreen
import com.example.acadamylassanscampos.presentation.screen.main.screens.MainForeScreen
import com.example.acadamylassanscampos.presentation.screen.main.screens.MainSacondScreen
import com.example.acadamylassanscampos.presentation.screen.main.screens.MainSevenScreen
import com.example.acadamylassanscampos.presentation.screen.main.screens.MainSixScreen
import com.example.acadamylassanscampos.presentation.screen.main.screens.MainThirdScreen

@Composable
fun MainNavigation(){

    val navController = rememberNavController()
    val mainFirstScreenRoute = Screens.MainFirstScreen.route.toString()
    val mainSecondScreenRoute = Screens.MaiiSecondScreen.route.toString()
    val mainThirdScreenRoute = Screens.MainThirdScreen.route.toString()
    val maimFourScreenRoute = Screens.MainFourScreen.route.toString()
    val mainFiveScreenRoute = Screens.MainFiveScreen.route.toString()
    val mainSixScreenRoute = Screens.MainSixScreen.route.toString()
    val mainSevenScreenRoute = Screens.MainSevenScreen.route.toString()
    val mainEighthScreenRoute = Screens.MainEighthScreen.route.toString()
    NavHost(
        navController = navController ,
        startDestination = mainFirstScreenRoute,
    ){
        composable(mainFirstScreenRoute){
            MainFirstScreen(callBackToScreen = {navController.navigate(mainSecondScreenRoute)})
        }
        composable(mainSecondScreenRoute){
            MainSacondScreen(callBackToScreen = {navController.navigate(mainThirdScreenRoute)})
        }
        composable(mainThirdScreenRoute){
            MainThirdScreen(callBackToScreen = {navController.navigate(maimFourScreenRoute)})
        }
        composable(maimFourScreenRoute){
            MainForeScreen(callBackToScreen = {navController.navigate(mainFiveScreenRoute)})
        }
        composable(mainFiveScreenRoute){
            MainFiveScreen(callBackToScreenpop = {navController.popBackStack()}, callBackToScreen = {navController.navigate(mainSixScreenRoute)})
        }
        composable(mainSixScreenRoute){
            MainSixScreen(callBackToScreen = {navController.navigate(mainSevenScreenRoute)}, callBackToScreenpop = {navController.popBackStack()})
        }
        composable(mainSevenScreenRoute){
            MainSevenScreen(callBackToScreen = {navController.navigate(mainEighthScreenRoute)}, callBackToScreenpop = {navController.popBackStack()})
        }
        composable(mainEighthScreenRoute){
            MainEighthScreen(callBackToScreen = {navController.navigate(mainEighthScreenRoute)}, callBackToScreenpop = {navController.popBackStack()})
        }
    }
}