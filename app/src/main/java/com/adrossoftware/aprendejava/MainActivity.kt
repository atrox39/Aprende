package com.adrossoftware.aprendejava

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import com.adrossoftware.aprendejava.ui.theme.AprendeJavaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AprendeJavaTheme {
                // A surface container using the 'background' color from the theme
                MainView()
            }
        }
    }
}

@Composable
fun MainView () {
    var menuItems = listOf<String>("Ayuda", "Salir")
    var expanded = remember {
        mutableStateOf(false)
    }
    var context = LocalContext.current
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = {
                        Text(text = "Aprende")
                    },
                    actions = {
                        Row() {
                            IconButton(onClick = {}) {
                                Icon(
                                    imageVector = Icons.Filled.Person,
                                    contentDescription = "User"
                                )
                            }
                            IconButton(onClick = {}) {
                                Icon(
                                    imageVector = Icons.Filled.Notifications,
                                    contentDescription = "User"
                                )
                            }
                            IconButton(onClick = {
                                expanded.value = true
                            }) {
                                Icon(
                                    imageVector = Icons.Filled.MoreVert,
                                    contentDescription = "User"
                                )
                            }
                            DropdownMenu(
                                expanded = expanded.value,
                                onDismissRequest = {
                                    expanded.value = false
                                },
                                offset = DpOffset((-40).dp, (-40).dp),
                            ) {
                                menuItems.forEach {
                                    DropdownMenuItem(onClick = {
                                        expanded.value = false
                                    }) {
                                        Text(text = it)
                                    }
                                }
                            }
                        }
                    }
                )
            },
            content = {
                TopHeader()
            }
        )
    }
}

@Composable
fun TopHeader() {
    var scrollMenu = rememberScrollState(0)
    Column(
        modifier = Modifier
            .padding(4.dp)
            .background(Color.Gray)
            .padding(4.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text("Aprende lo basico")
            Text("VER MAS")
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(scrollMenu)
                .padding(8.dp)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Image(
                    contentScale = ContentScale.Crop,
                    painter = painterResource(id = R.drawable.ic_user),
                    contentDescription = "",
                    modifier = Modifier
                        .size(80.dp)
                        .clip(
                            CircleShape
                        )
                        .border(5.dp, Color.White, CircleShape)
                        .padding(8.dp)
                )
                Text(text = "Python")
            }
            Spacer(modifier = Modifier.width(12.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Image(
                    contentScale = ContentScale.Crop,
                    painter = painterResource(id = R.drawable.ic_user),
                    contentDescription = "",
                    modifier = Modifier
                        .size(80.dp)
                        .clip(
                            CircleShape
                        )
                        .border(5.dp, Color.White, CircleShape)
                        .padding(8.dp)
                )
                Text(text = "Java")
            }
            Spacer(modifier = Modifier.width(12.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Image(
                    contentScale = ContentScale.Crop,
                    painter = painterResource(id = R.drawable.ic_user),
                    contentDescription = "",
                    modifier = Modifier
                        .size(80.dp)
                        .clip(
                            CircleShape
                        )
                        .border(5.dp, Color.White, CircleShape)
                        .padding(8.dp)
                )
                Text(text = "C#")
            }
            Spacer(modifier = Modifier.width(12.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Image(
                    contentScale = ContentScale.Crop,
                    painter = painterResource(id = R.drawable.ic_user),
                    contentDescription = "",
                    modifier = Modifier
                        .size(80.dp)
                        .clip(
                            CircleShape
                        )
                        .border(5.dp, Color.White, CircleShape)
                        .padding(8.dp)
                )
                Text(text = "Javascript")
            }
            Spacer(modifier = Modifier.width(12.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Image(
                    contentScale = ContentScale.Crop,
                    painter = painterResource(id = R.drawable.ic_user),
                    contentDescription = "",
                    modifier = Modifier
                        .size(80.dp)
                        .clip(
                            CircleShape
                        )
                        .border(5.dp, Color.White, CircleShape)
                        .padding(8.dp)
                )
                Text(text = "Go")
            }
            Spacer(modifier = Modifier.width(12.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Image(
                    contentScale = ContentScale.Crop,
                    painter = painterResource(id = R.drawable.ic_user),
                    contentDescription = "",
                    modifier = Modifier
                        .size(80.dp)
                        .clip(
                            CircleShape
                        )
                        .border(5.dp, Color.White, CircleShape)
                        .padding(8.dp)
                )
                Text(text = "C")
            }
            Spacer(modifier = Modifier.width(12.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Image(
                    contentScale = ContentScale.Crop,
                    painter = painterResource(id = R.drawable.ic_user),
                    contentDescription = "",
                    modifier = Modifier
                        .size(80.dp)
                        .clip(
                            CircleShape
                        )
                        .border(5.dp, Color.White, CircleShape)
                        .padding(8.dp)
                )
                Text(text = "C++")
            }
            Spacer(modifier = Modifier.width(12.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Image(
                    contentScale = ContentScale.Crop,
                    painter = painterResource(id = R.drawable.ic_user),
                    contentDescription = "",
                    modifier = Modifier
                        .size(80.dp)
                        .clip(
                            CircleShape
                        )
                        .border(5.dp, Color.White, CircleShape)
                        .padding(8.dp)
                )
                Text(text = "Kotlin")
            }
            Spacer(modifier = Modifier.width(12.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Image(
                    contentScale = ContentScale.Crop,
                    painter = painterResource(id = R.drawable.ic_user),
                    contentDescription = "",
                    modifier = Modifier
                        .size(80.dp)
                        .clip(
                            CircleShape
                        )
                        .border(5.dp, Color.White, CircleShape)
                        .padding(8.dp)
                )
                Text(text = "Swift")
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    AprendeJavaTheme {
        MainView()
    }
}