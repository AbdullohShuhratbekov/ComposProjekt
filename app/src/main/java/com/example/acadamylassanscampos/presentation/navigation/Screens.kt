package com.example.acadamylassanscampos.presentation.navigation

import android.annotation.SuppressLint
import androidx.annotation.StringRes
import com.example.acadamylassanscampos.R

@SuppressLint("SupportAnnotationUsage")

sealed class Screens(@StringRes val route:Int) {

    object MainFirstScreen:Screens(R.string.mainFirstScreen)
    object MaiiSecondScreen:Screens(R.string.mainSecondScreen)
    object MainThirdScreen:Screens(R.string.mainThirdScreen)
    object MainFourScreen:Screens(R.string.mainFourScreen)
    object MainFiveScreen:Screens(R.string.mainFiveScreen)
    object MainSixScreen:Screens(R.string.mainSixScreen)
    object MainSevenScreen:Screens(R.string.mainSevenScreen)
    object MainEighthScreen:Screens(R.string.mainEighthScreen)
}