package com.example.acadamylassanscampos.presentation.screen.main.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.acadamylassanscampos.R
import com.example.acadamylassanscampos.presentation.theme.TaskerBlue
@Preview
@Composable
fun MainSeven() {
    MainSevenScreen(
        callBackToScreen = {},
        callBackToScreenpop = {})
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainSevenScreen(
    modifier: Modifier = Modifier,
            callBackToScreen: () -> Unit,
    callBackToScreenpop: () -> Unit,
) {
    var textFieldStata by remember {
        mutableStateOf("")
    }
    var textFieldStataof by remember {
        mutableStateOf("")
    }
    var textFieldStataon by remember {
        mutableStateOf("")
    }
    var textFieldStatand by remember {
        mutableStateOf("")
    }
    var textFieldStataok by remember {
        mutableStateOf("")
    }
    Column {
        IconButton(
            modifier = modifier.padding(12.dp),
            onClick = {
                callBackToScreenpop()
            })
        {
            Icon(

                painter = painterResource(id = R.drawable.arrow_left)
                , contentDescription = null,
            )
        }
    }
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 173.dp)
            .padding(horizontal = 22.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Card(
            modifier = modifier
                .height(90.dp)
                .width(90.dp)
        ) {
            Image(
                modifier = Modifier.fillMaxSize(),
                painter = painterResource(id = R.drawable.claps_one),
                contentDescription = null,
            )
        }
        Text(
            modifier = modifier.padding(top = 32.dp),
            text = "Enter OTP",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = TaskerBlue
        )
        Text(
            modifier = modifier.padding(top = 16.dp, start = 12.dp, end = (12.dp), bottom = 16.dp),
            text = "Enter the OTP code we just sent\n" +
                    "you on your registered Email/Phone number",
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium,
            color = MaterialTheme.colorScheme.onBackground,
            textAlign = TextAlign.Center
        )
        Row(
            modifier = modifier.padding(12.dp)
        ) {

            Card(
                modifier = modifier
                    .height(66.dp)
                    .width(70.dp)
                    .padding(start = 12.dp)
            ) {
                TextField(modifier = modifier.fillMaxWidth(),
                    value = textFieldStata,
                    onValueChange = {
                        textFieldStata = it
                    },
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                    ),
                    placeholder = {
                    })
            }
            Card(
                modifier = modifier
                    .height(66.dp)
                    .width(70.dp)
                    .padding(start = 12.dp)
            ) {
                TextField(modifier = modifier.fillMaxWidth(),
                    value = textFieldStataof,
                    onValueChange = {
                        textFieldStataof = it
                    },
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor =  Color.Transparent,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                    ),
                    placeholder = {

                    })
            }
            Card(
                modifier = modifier
                    .height(66.dp)
                    .width(70.dp)
                    .padding(start = 12.dp)

            ) {
                TextField(modifier = modifier.fillMaxWidth(),
                    value = textFieldStataon,
                    onValueChange = {
                        textFieldStataon = it
                    },
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor =  Color.Transparent,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                    ),
                    placeholder = {

                    })
            }
            Card(
                modifier = modifier
                    .height(66.dp)
                    .width(70.dp)
                    .padding(start = 12.dp)
            ) {
                TextField(modifier = modifier.fillMaxWidth(),
                    value = textFieldStataok,
                    onValueChange = {
                        textFieldStataok = it
                    },
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor =  Color.Transparent,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                    ),
                    placeholder = {

                    })
            }
            Card(
                modifier = modifier
                    .height(66.dp)
                    .width(70.dp)
                    .padding(start = 12.dp)
            ) {
                TextField(modifier = modifier.fillMaxWidth(),
                    value = textFieldStatand,
                    onValueChange = {
                        textFieldStatand = it
                    },
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                    ),
                    placeholder = {

                    })
            }

            Button(
                onClick = {
                          callBackToScreen()
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp)
                    .height(60.dp)
            )
            {
                Text(
                    text = "Log in",
                    fontSize = 16.sp,
                    fontWeight = FontWeight(500),
                )
            }
        }
        Row(
            modifier = Modifier
                .padding(top = 16.dp, bottom = 16.dp)


        ) {
            Text(
                text = "Didn’t get OTP? ",
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                color = MaterialTheme.colorScheme.onBackground,
            )
            Text(
                modifier = Modifier
                    .clickable {
                        callBackToScreen()
                    },
                text = " Resend OTP ",
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                color = TaskerBlue
            )
        }
    }
}