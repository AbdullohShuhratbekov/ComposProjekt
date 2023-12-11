package com.example.acadamylassanscampos.presentation.screen.main.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.acadamylassanscampos.R

@Preview
@Composable
fun Preview() {
    MainThirdScreen(callBackToScreen = {

    })
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainThirdScreen(
    modifier: Modifier = Modifier,
    callBackToScreen: () -> Unit,
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 60.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = painterResource(id = R.drawable.saly_second),
            contentDescription = null,
        )
        Text(
            modifier = modifier.padding(top = 100.dp),
            text = stringResource(id = R.string.text),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        Text(
            modifier = modifier.padding(top = 24.dp),
            text = stringResource(id = R.string.text_manu),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        Text(
            modifier = modifier.padding(top = 80.dp),
            text = stringResource(id = R.string.manu),
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            textAlign = TextAlign.Center
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 70.dp, end = 12.dp),
            verticalAlignment = Alignment.Bottom

        ) {
            Spacer(modifier = Modifier.weight(1f))
            Text(
                modifier = modifier
                    .clickable {
                        callBackToScreen()
                    },
                text = "next",
                fontSize = 20.sp,
                fontWeight = FontWeight.Light,
                color = MaterialTheme.colorScheme.onBackground
            )
        }
    }
}
