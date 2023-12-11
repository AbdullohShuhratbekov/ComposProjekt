package com.example.acadamylassanscampos.presentation.screen.main.screens

import android.widget.Toast
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
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
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
import androidx.compose.ui.platform.LocalContext
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
fun MaiFore() {
    MainForeScreen(callBackToScreen = {
    })
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainForeScreen(
    modifire: Modifier = Modifier,
            callBackToScreen: () -> Unit,
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
    Column(
        modifier = modifire
            .fillMaxSize()
            .padding(top = 40.dp)
            .padding(horizontal = 22.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Card(
            modifier = modifire
                .height(90.dp)
                .width(90.dp)
        ) {
            Image(
                modifier = Modifier.fillMaxSize(),
                painter = painterResource(id = R.drawable.claps),
                contentDescription = null,
            )
        }
        Text(
            modifier = modifire.padding(top = 12.dp),
            text = stringResource(id = R.string.claps),
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = TaskerBlue
        )
        Text(
            modifier = modifire.padding(top = 16.dp, start = 12.dp, end = (12.dp), bottom = 16.dp),
            text = stringResource(id = R.string.text_first_name),
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium,
            color = MaterialTheme.colorScheme.onBackground,
            textAlign = TextAlign.Center
        )
        Row(
            modifier = modifire.padding(8.dp)
        ) {
            Card(
                modifier = modifire
                    .height(50.dp)
                    .width(163.dp)
                    .padding(end = 8.dp)
            ) {
                Row {
                    Image(
                        modifier = Modifier.padding(12.dp),
                        painter = painterResource(id = R.drawable.facebook),
                        contentDescription = null,
                    )
                    Text(
                        modifier = modifire.padding(12.dp),
                        text = stringResource(id = R.string.facebook),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Card(
                modifier = modifire
                    .height(50.dp)
                    .width(163.dp)
                    .padding(start = 15.dp)
            ) {
                Row {
                    Image(
                        modifier = Modifier.padding(8.dp),
                        painter = painterResource(id = R.drawable.group),
                        contentDescription = null,
                    )
                    Text(
                        modifier = modifire.padding(12.dp),
                        text = stringResource(id = R.string.google),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
        Divider(
            modifier = modifire.padding(top = 16.dp, bottom = 8.dp)
        )
        Column(
            modifier = modifire.padding(12.dp)
        ) {
            Card(
                modifier = modifire
                    .height(60.dp)
                    .width(345.dp)
            ) {
                TextField(modifier = modifire.fillMaxWidth(),
                    value = textFieldStata,
                    onValueChange = {
                        textFieldStata = it
                    },
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = MaterialTheme.colorScheme.background,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                    ),
                    placeholder = {
                        Row {}
                        Text(
                            text = stringResource(id = R.string.name),
                            fontSize = 16.sp,
                            fontWeight = FontWeight(500),
                            color = if (isSystemInDarkTheme()) Color.Gray
                            else Color.Gray
                        )
                    })
            }
        }
        Column(
            modifier = modifire.padding(12.dp)
        ) {
            Card(
                modifier = modifire
                    .height(60.dp)
                    .width(345.dp)
            ) {
                TextField(modifier = modifire.fillMaxWidth(),
                    value = textFieldStataof,
                    onValueChange = {
                        textFieldStataof = it
                    },
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = MaterialTheme.colorScheme.background,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                    ),
                    placeholder = {
                        Text(
                            text = stringResource(id = R.string.number),
                            fontSize = 16.sp,
                            fontWeight = FontWeight(500),
                            color = if (isSystemInDarkTheme()) Color.Gray
                            else Color.Gray
                        )
                    })
            }
        }
        Column(
            modifier = modifire.padding(16.dp)
        ) {
            Card(
                modifier = modifire
                    .height(60.dp)
                    .width(345.dp)
            ) {
                TextField(modifier = modifire.fillMaxWidth(),
                    value = textFieldStataon,
                    onValueChange = {
                        textFieldStataon = it
                    },
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = MaterialTheme.colorScheme.background,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                    ),
                    placeholder = {
                        Text(
                            text = stringResource(id = R.string.password),
                            fontSize = 16.sp,
                            fontWeight = FontWeight(500),
                            color = if (isSystemInDarkTheme()) Color.Gray
                            else Color.Gray
                        )
                    })
            }
        }
        Text(
            modifier = modifire
                .padding(top = 12.dp, bottom = 12.dp),
            text = stringResource(id = R.string.agree),
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium,
            color = MaterialTheme.colorScheme.onBackground,
            textAlign = TextAlign.Center
        )
        Button(
            onClick = {

            },
            modifier = Modifier
                .height(60.dp)
                .width(340.dp)
        )
        {
            Text(
                text = stringResource(id = R.string.account),
                fontSize = 16.sp,
                fontWeight = FontWeight(500),

                )
        }
        Row (
            modifier = modifire.fillMaxWidth()
        ){
            Text(
                modifier = modifire.padding(12.dp),
                text = "Do you have account? ",
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                color = MaterialTheme.colorScheme.onBackground,
            )
            val context = LocalContext.current
            fun showToast(message: String) {
                Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
            }
            Text(
                modifier = Modifier
                    .padding(top = 12.dp, )
                    .clickable {
                        if (textFieldStata.isNotEmpty()) {
                            callBackToScreen()
                        } else {
                            showToast("Заполните все поля")
                        }
                    },
                text = "Sing in ",
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                color = TaskerBlue
            )
        }
    }
}


