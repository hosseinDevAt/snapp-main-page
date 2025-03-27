package ir.hosseindevat.snapp_main_page

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

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
    heightDp = 900
)

@Composable
fun SetUI(){

    Column(
        modifier = Modifier
            .padding(10.dp)
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {



    }

}
