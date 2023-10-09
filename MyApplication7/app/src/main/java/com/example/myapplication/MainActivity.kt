package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import android.annotation.SuppressLint
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.res.painterResource
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.foundation.background
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.BackdropScaffoldDefaults.PeekHeight
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.platform.*
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.Dp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterialApi::class)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        color = colorResource(id = R.color.GlubokiyBlack)
                    ),
            ) {
                //HighBlock()
                //menu()
                //menuu()
                BottomSheet()

            }

        }
    }
}

@Composable
fun HighBlock() {
    Box(modifier = Modifier.fillMaxWidth()) {
        //кнопка выйти
        Row(
            modifier = Modifier
                .background(
                    color = colorResource(id = R.color.SvetloBlack),
                    shape = RoundedCornerShape(
                        topStart = 0.dp,
                        topEnd = 0.dp,
                        bottomStart = 25.dp,
                        bottomEnd = 25.dp
                    )
                )
                .fillMaxWidth()
                .fillMaxHeight(0.10F)
                .padding(10.dp),

            ) {

        }
    }


}



@Preview
@OptIn(ExperimentalMaterialApi::class)
@Composable
fun BottomSheet() {


    Column (modifier = Modifier
        .fillMaxSize()
        .background(
            shape = RoundedCornerShape(
                topStart = 0.dp,
                topEnd = 0.dp,
                bottomStart = 25.dp,
                bottomEnd = 25.dp
            ),
            color = Color.Transparent
        )
    ){

        HighBlock()

        Box(modifier = Modifier
            .fillMaxSize()
            .padding(PaddingValues(top = 20.dp))
            .background(color = colorResource(id = R.color.GlubokiyBlack))){
            val scope = rememberCoroutineScope()

            Spacer(modifier = Modifier.height(16.dp))




            BottomSheetScaffold(
                modifier = Modifier
                    .padding(PaddingValues(bottom = 250.dp)
                    ),
                backgroundColor = colorResource(id = R.color.GlubokiyBlack),
                sheetPeekHeight = 50.dp,
                sheetContent = {
                    Box(
                        Modifier
                            .fillMaxSize()
                            .fillMaxWidth()
                            .fillMaxHeight()
                            .background(
                                color = colorResource(id = R.color.SvetloBlack),
                                shape = RoundedCornerShape(
                                    topStart = 25.dp,
                                    topEnd = 25.dp,
                                    bottomEnd = 0.dp,
                                    bottomStart = 0.dp
                                )
                            ),



                        contentAlignment = Alignment.Center
                    ) {

                        Box(modifier = Modifier
                            .fillMaxHeight()
                            .height(50.dp)
                            .padding(PaddingValues(top = 20.dp))){
                            Surface(
                                modifier = Modifier
                                    .width(100.dp)
                                    .height(5.dp)
                                    .background(Color.White)

                                    ,
                                shape = RoundedCornerShape(25.dp)

                            ) {
                                // Внутреннее содержимое, если необходимо
                            }
                            Box(modifier = Modifier
                                .padding(PaddingValues(top = 10.dp))
                            )
                            {


                            }



                        }
                        Text("в этой штуке ")
                    }

                }
            ) { innerPadding ->
                Box(
                    Modifier
                        .fillMaxSize()
                        .padding(innerPadding)
                        .background(
                            color = colorResource(id = R.color.GlubokiyBlack)
                        )) {
                    Text("внутренний элемент",color = Color.White)
                }


            }






            Box(modifier = Modifier
                //.fillMaxWidth()
                .height(250.dp)
                .background(color = colorResource(id = R.color.SvetloBlack))
                .align(Alignment.BottomCenter))
            {

                Column() {
                    var textValue by remember { mutableStateOf("") }
                    var textValue2 by remember { mutableStateOf("") }


                    TextField(
                        value = textValue2,
                        onValueChange = { textValue2 = it },
                        placeholder = {
                            androidx.compose.material.Text(
                                text = "Ваше сообщение",
                                color = Color.White
                            )
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .background(
                                color = colorResource(id = R.color.SvetloBlack),
                                shape = RoundedCornerShape(0.dp),
                            )
                    )


               // }

                                LazyRow(
                                    modifier = Modifier
                                        .padding(3.dp)
                                        .height(50.dp)
                                ) {
                                    items(1) { element ->


                                                Button(
                                                    onClick = {},
                                                    modifier = Modifier
                                                        //.fillMaxSize()
                                                        .padding(top = 5.dp, start = 20.dp, end = 20.dp, bottom = 5.dp)
                                                        .width(100.dp)
                                                        .height(50.dp)
                                                        .border(
                                                            width = 1.dp,
                                                            color = colorResource(id = R.color.BorderBlack),
                                                            shape = RoundedCornerShape(10.dp),
                                                        )
                                                        .background(
                                                            color = colorResource(id = R.color.SvetloBlack),
                                                            shape = RoundedCornerShape(0.dp)
                                                        ),
                                                    colors = ButtonDefaults.buttonColors(
                                                        backgroundColor = colorResource(id = R.color.SvetloBlack),
                                                        contentColor = Color.White
                                                    ),
                                                )
                                                {
                                                    Text(
                                                        text = "Музыка",
                                                        modifier = Modifier
                                                            .background(color = Color.Transparent),
                                                        fontSize = 16.sp,
                                                        color = colorResource(R.color.white),
                                                        textAlign = TextAlign.Center,
                                                    )
                                                }
                                                Button(
                                                    onClick = {},
                                                    modifier = Modifier
                                                        //.fillMaxSize()
                                                        .padding(top = 5.dp, start = 20.dp, end = 20.dp, bottom = 5.dp)
                                                        .width(100.dp)
                                                        .height(50.dp)
                                                        .border(
                                                            width = 1.dp,
                                                            color = colorResource(id = R.color.BorderBlack),
                                                            shape = RoundedCornerShape(10.dp),
                                                        )
                                                        .background(
                                                            color = colorResource(id = R.color.SvetloBlack),
                                                            shape = RoundedCornerShape(0.dp)
                                                        ),
                                                    colors = ButtonDefaults.buttonColors(
                                                        backgroundColor = colorResource(id = R.color.SvetloBlack),
                                                        contentColor = Color.White
                                                    ),
                                                )
                                                {
                                                    Text(
                                                        text = "Видео",
                                                        modifier = Modifier
                                                            .background(color = Color.Transparent),
                                                        fontSize = 16.sp,
                                                        color = colorResource(R.color.white),
                                                        textAlign = TextAlign.Center,
                                                    )
                                                }
                                                Button(
                                                    onClick = {},
                                                    modifier = Modifier
                                                        //.fillMaxSize()
                                                        .padding(top = 5.dp, start = 20.dp, end = 20.dp, bottom = 5.dp)
                                                        .width(100.dp)
                                                        .height(50.dp)
                                                        .border(
                                                            width = 1.dp,
                                                            color = colorResource(id = R.color.BorderBlack),
                                                            shape = RoundedCornerShape(10.dp),
                                                        )
                                                        .background(
                                                            color = colorResource(id = R.color.SvetloBlack),
                                                            shape = RoundedCornerShape(0.dp)
                                                        ),
                                                    colors = ButtonDefaults.buttonColors(
                                                        backgroundColor = colorResource(id = R.color.SvetloBlack),
                                                        contentColor = Color.White
                                                    ),
                                                )
                                                {
                                                    Text(
                                                        text = "Фото",
                                                        modifier = Modifier
                                                            .background(color = Color.Transparent),
                                                        fontSize = 16.sp,
                                                        color = colorResource(R.color.white),
                                                        textAlign = TextAlign.Center,
                                                    )
                                                }
                                                Button(
                                                    onClick = {},
                                                    modifier = Modifier
                                                        //.fillMaxSize()
                                                        .padding(top = 5.dp, start = 20.dp, end = 20.dp, bottom = 5.dp)
                                                        .width(100.dp)
                                                        .height(50.dp)
                                                        .border(
                                                            width = 1.dp,
                                                            color = colorResource(id = R.color.BorderBlack),
                                                            shape = RoundedCornerShape(10.dp),
                                                        )
                                                        .background(
                                                            color = colorResource(id = R.color.SvetloBlack),
                                                            shape = RoundedCornerShape(0.dp)
                                                        ),
                                                    colors = ButtonDefaults.buttonColors(
                                                        backgroundColor = colorResource(id = R.color.SvetloBlack),
                                                        contentColor = Color.White
                                                    ),
                                                )
                                                {
                                                    Text(
                                                        text = "Файл",
                                                        modifier = Modifier
                                                            .background(color = Color.Transparent),
                                                        fontSize = 16.sp,
                                                        color = colorResource(R.color.white),
                                                        textAlign = TextAlign.Center,
                                                    )
                                                }

                                        }


                                    }



                    OutlinedTextField(
                        value = textValue,
                        onValueChange = {
                            textValue = it
                        },
                        textStyle = TextStyle(fontSize = 16.sp),
                        placeholder = {
                            androidx.compose.material.Text(
                                text = "Содержание",
                                color = Color.Gray
                            )
                        },


                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(PaddingValues(horizontal = 20.dp))
                            .height(80.dp)
                            .border(

                                width = 1.dp,
                                color = colorResource(id = R.color.BorderBlack),
                                shape = RoundedCornerShape(25.dp),
                            )
                            .background(
                                color = colorResource(id = R.color.SvetloBlack),
                                shape = RoundedCornerShape(0.dp),
                            )

                    )

                    Button(
                        onClick = {},
                        modifier = Modifier
                            //.fillMaxSize()
                            .padding(top = 5.dp, start = 20.dp, end = 20.dp, bottom = 5.dp)
                            .fillMaxWidth()
                            .height(50.dp)

                            .background(
                                shape = RoundedCornerShape(25.dp),
                                color = Color.Transparent
                            ),
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = colorResource(id = R.color.YrkiyRed),
                            contentColor = Color.White
                        ),
                    )
                    {
                        Text(
                            text = " Сохранить",
                            modifier = Modifier
                                //.fillMaxSize()
                                .background(
                                    color = Color.Transparent
                                ),
                            fontSize = 16.sp,
                            color = colorResource(R.color.white),
                            textAlign = TextAlign.Center,

                            )
                    }
                }




            }
                            }









            }
        }











