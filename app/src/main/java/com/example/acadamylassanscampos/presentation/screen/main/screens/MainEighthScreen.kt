package com.example.acadamylassanscampos.presentation.screen.main.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.acadamylassanscampos.R
import com.example.acadamylassanscampos.presentation.theme.TaskerBlue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainEighthScreen(
    modifier:Modifier = Modifier,
    callBackToScreen: () -> Unit,
    callBackToScreenpop: () -> Unit,

) {
    var textFieldStata by remember {
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
            .padding(top = 173.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Card(
            modifier = modifier
                .height(90.dp)
                .width(90.dp)
        ) {
            Image(
                modifier = Modifier.fillMaxSize(),
                painter = painterResource(id = R.drawable.look),
                contentDescription = null,
            )
        }
        Text(
            modifier = modifier.padding(top = 32.dp),
            text = "Reset Password",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = TaskerBlue
        )
        Text(
            modifier = modifier.padding(top = 16.dp, start = 12.dp, end = (12.dp), bottom = 16.dp),
            text = "It was popularised in the 1960s with the release of Letraset sheetscontaining Lorem Ipsum.",
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium,
            color = MaterialTheme.colorScheme.onBackground,
            textAlign = TextAlign.Center
        )

        Column(
            modifier = modifier.padding(12.dp)
        ) {
            Card(
                modifier = modifier
                    .height(60.dp)
                    .width(345.dp)
            ) {
                TextField(modifier = modifier.fillMaxWidth(),
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
                        Text(
                            text = "*******",
                            fontSize = 16.sp,
                            fontWeight = FontWeight(500),
                            color = if (isSystemInDarkTheme()) Color.Gray
                            else Color.Gray
                        )
                    })
            }
            Card(
                modifier = modifier
                    .height(60.dp)
                    .width(345.dp)
            ) {
                TextField(modifier = modifier.fillMaxWidth(),
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
                        Text(
                            text = "*******",
                            fontSize = 16.sp,
                            fontWeight = FontWeight(500),
                            color = if (isSystemInDarkTheme()) Color.Gray
                            else Color.Gray
                        )
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
                    text = "Submitting...",
                    fontSize = 16.sp,
                    fontWeight = FontWeight(500),
                )
            }
        }
    }
}
