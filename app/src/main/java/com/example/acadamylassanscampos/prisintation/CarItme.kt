package com.example.acadamylassanscampos.prisintation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.acadamylassanscampos.data.CarModel

@Composable
fun FoodItem(
    CarModel: CarModel
) {
    Card(
        modifier = Modifier.padding(12.dp)
    ) {
        Row {
            Column(
                modifier = Modifier.padding(8.dp)
            ) {
                Text(
                    text = CarModel.carName,
                    fontSize = 18.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = CarModel.carModel,
                    fontSize = 16.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold

                )
                Text(
                    text = CarModel.carSpeed.toString(),
                    fontSize = 12.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold

                )
            }
            Spacer(modifier = Modifier.weight(1f))
            AsyncImage(
                modifier = Modifier.size(130.dp),
                model = CarModel.carImage,
                contentScale = ContentScale.Crop,
                contentDescription = null,
                alignment = Alignment.CenterEnd
            )

        }

    }
}
