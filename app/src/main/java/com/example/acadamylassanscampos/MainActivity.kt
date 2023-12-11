package com.example.acadamylassanscampos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.acadamylassanscampos.presentation.navigation.MainNavigation
import com.example.acadamylassanscampos.presentation.screen.main.screens.MainEighthScreen
import com.example.acadamylassanscampos.presentation.screen.main.screens.MainSevenScreen
import com.example.acadamylassanscampos.presentation.theme.AcadamyLassansCamposTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AcadamyLassansCamposTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                )
                {
                   MainNavigation()
                }
            }
        }
    }
}




