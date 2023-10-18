package com.example.weatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp.ui.theme.WeatherAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    HomeScreen()
                }
            }
        }
    }
}




@Composable
fun HomeScreen(){
    Column (modifier = Modifier
        .padding(20.dp)
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {

        Text(
            text= "Maula Ghani Al Aufa",
            textAlign = TextAlign.Center,
            fontSize = 30.sp,
            fontFamily = FontFamily.Serif)

        Spacer(modifier = Modifier.padding(13.dp))

        StatusBox()

        Spacer(modifier = Modifier.padding(13.dp))

        LocnTemp()

        Spacer(modifier = Modifier.padding(13.dp))

        DetailBox()





    }
}

@Composable
fun StatusBox(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(25.dp))
        .background(color = Color.Cyan)) {

        Column(modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally){
            Image(painterResource(id = R.drawable.background), contentDescription = "foto",
                modifier = Modifier.size(200.dp))
            Text(
                text = "Rain",
                fontSize = 30.sp,

            )
        }
    }
}

@Composable
fun LocnTemp() {
    Text(text="18°C", fontWeight = FontWeight.Bold, fontSize = 64.sp)
    Row(verticalAlignment = Alignment.CenterVertically){
        Image(painterResource(id =R.drawable.location ),contentDescription = "lokasi" )
        Text(text ="Yogyakarta",
            fontSize = 30.sp,
            color = Color.Gray,
            textAlign = TextAlign.Center)

    }
    Spacer(modifier = Modifier.padding(13.dp))

    Text(text = "TamanTirto, Kashan, Bantul, Daerah Istimewa Yogyakarta",
        fontSize = 17.sp,
        textAlign = TextAlign.Center,

        )
}



@Composable
fun DetailBox(){
   Box(
       modifier = Modifier
           .clip(RoundedCornerShape(10.dp))
           .fillMaxWidth()
           .background(Color.Cyan)
       ){
       Column {
           Row(
               verticalAlignment = Alignment.CenterVertically,
               horizontalArrangement = Arrangement.SpaceAround,
               modifier = Modifier
                   .fillMaxWidth()
                   .padding(20.dp)
           ) {
               Column (
                   horizontalAlignment = Alignment.CenterHorizontally,
               ){
                   Text(text = "Humidity")
                   Text(text = "98%", fontWeight = FontWeight.Bold, fontSize = 20.sp)
               }
               Column (
                   horizontalAlignment = Alignment.CenterHorizontally,
               ){
                    Text(text = "UV Index")
                   Text(text = "9/10", fontWeight = FontWeight.Bold, fontSize = 20.sp)
               }

           }
           Row(
               verticalAlignment = Alignment.CenterVertically,
               horizontalArrangement = Arrangement.SpaceAround,
               modifier = Modifier
                   .fillMaxWidth()
                   .padding(20.dp)
           ){
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                ){
                    Text(text = "Sunrise")
                    Text(text = "05.00 AM", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                }
               Column (
                   horizontalAlignment = Alignment.CenterHorizontally,
               ){
                   Text(text = "Sunset")
                   Text(text = "05.40 AM", fontWeight = FontWeight.Bold, fontSize = 20.sp)
               }
           }
       }
   }

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WeatherAppTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
        )
        HomeScreen()
    }
}