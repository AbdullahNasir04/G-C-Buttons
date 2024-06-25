package com.example.buttons

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun GoogleButton()
{
  Column {
      Button(
          onClick = { },
          colors = ButtonDefaults.buttonColors(Color.White))
      {
          Row(verticalAlignment = Alignment.CenterVertically)
          {
              Image(
                  painter = painterResource(id = R.drawable.img),
                  contentDescription = null,
                  modifier = Modifier.size(30.dp)
              )
              Spacer(modifier = Modifier.width(10.dp))
              Text(
                  text = "SignIn With Google",
                  color = Color.Black)
            }
        }
    }

    Spacer(modifier = Modifier.height(20.dp))

    Button(
        onClick = { },
        colors = ButtonDefaults.buttonColors(Color.White))
    {
        Row(verticalAlignment = Alignment.CenterVertically)
        {
            Image(
                painter = painterResource(id = R.drawable.img_1),
                contentDescription = null,
                modifier = Modifier.size(30.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = "SignIn With phone no.",
                color = Color.Black)
        }
    }
}