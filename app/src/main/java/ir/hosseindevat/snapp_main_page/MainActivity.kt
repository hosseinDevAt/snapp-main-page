package ir.hosseindevat.snapp_main_page

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ir.hosseindevat.snap_main_page.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            SetUI()
        }
    }
}

@Preview(
    showBackground = true,
    name = "snapp-main-page",
    widthDp = 450,
    heightDp = 1000
)

@Composable
private fun SetUI() {

    Box {

        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
        ) {

            SpacerHeight(50)

            TopItems()

            SpacerHeight(30)

            BannerItem()

            SpacerHeight(40)

            Cats()

            SpacerHeight(40)

            BannerItem()

        }

        Box(
            modifier = Modifier.fillMaxSize().padding(20.dp),
            contentAlignment = Alignment.BottomCenter
        ) {
            BottomItem()
        }

    }

}

@Composable
private fun SpacerHeight(size: Int) {
    Spacer(Modifier.height(size.dp))
}

@Composable
private fun SpacerWidth(size: Int) {
    Spacer(Modifier.width(size.dp))
}

@Composable
private fun TopItems() {

    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Absolute.SpaceEvenly

    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CreatorItem(R.drawable.food, "food", "غذا")
            SpacerHeight(20)
            CreatorItem(R.drawable.bike, "bike", "اسنپ باکس")
            SpacerHeight(20)
            CreatorItem(R.drawable.credit, "credit", "سرویس اعتباری")
            SpacerHeight(20)
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CreatorItem(R.drawable.taxi, "taxi", "اسنپ")
            SpacerHeight(20)
            CreatorItem(R.drawable.hotel, "hotel", "هتل")
            SpacerHeight(20)
            CreatorItem(R.drawable.pickup, "pickup", "وانت")
            SpacerHeight(20)
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CreatorItem(R.drawable.doctor, "doctor", "دکتر")
            SpacerHeight(20)
            CreatorItem(R.drawable.moving, "moving", "کامیون")
            SpacerHeight(20)
            CreatorItem(R.drawable.food, "food", "غذا")
            SpacerHeight(20)
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CreatorItem(R.drawable.credit, "credit", "سرویس اعتباری")
            SpacerHeight(20)
            CreatorItem(R.drawable.food, "food", "غذا")
            SpacerHeight(20)
            CreatorItem(R.drawable.bike, "bike", "اسنپ باکس")
            SpacerHeight(20)
        }


    }

}

@Composable
private fun CreatorItem(src: Int, contentDesc: String, title: String) {
    Image(
        painter = painterResource(src),
        contentDescription = contentDesc,
    )

    Text(
        text = title,
        fontSize = 14.sp
    )
}

@Composable
private fun BannerItem() {

    Surface(
        shape = AbsoluteRoundedCornerShape(10.dp),
        modifier = Modifier.padding(horizontal = 20.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.banner),
            contentDescription = "banner",
            modifier = Modifier
                .fillMaxWidth()
                .height(190.dp),
            contentScale = ContentScale.FillBounds
        )
    }

}

@Composable
private fun Cats() {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .horizontalScroll(rememberScrollState(), reverseScrolling = true),
        verticalAlignment = Alignment.CenterVertically
    ) {

        for (item in 1..10) {
            Card(
                modifier = Modifier
                    .padding(8.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(4.dp)
            ) {

                Surface(
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.banana),
                        contentDescription = "banana",
                        modifier = Modifier
                            .size(100.dp)
                    )
                }
            }

        }

    }


}

@Composable
private fun BottomItem(){

    Card(
        modifier = Modifier
            .padding(2.dp)
            .width(280.dp),
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(6.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {

        Row(
            modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                CreatorItem(R.drawable.bike, "bike", "اسنپ باکس")
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                CreatorItem(R.drawable.hotel, "hotel", "هتل")
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                CreatorItem(R.drawable.food, "food", "غذا")
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                CreatorItem(R.drawable.taxi, "taxi", "اسنپ")
            }
        }

    }

}