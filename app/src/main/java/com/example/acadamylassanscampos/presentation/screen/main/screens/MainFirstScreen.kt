package com.example.acadamylassanscampos.presentation.screen.main.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.acadamylassanscampos.R
import com.example.acadamylassanscampos.presentation.theme.TaskerBlue
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Preview
@Composable
fun Previews() {
    MainFirstScreen(callBackToScreen = {})
}

@Composable
fun MainFirstScreen(
    modifier: Modifier = Modifier,
    callBackToScreen: () -> Unit,
) {
    val coroutineScope = rememberCoroutineScope()
    LaunchedEffect(key1 = true) {
        coroutineScope.launch {
            delay(3000)
            callBackToScreen()
        }
    }
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Image(
            painter = painterResource(id = R.drawable.log) ,
            contentDescription = null,
        )
        Text(
            modifier = modifier.padding(top = 18.dp),
            text = stringResource(id = R.string.manu_text),
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = TaskerBlue
        )
    }
}