package com.mobile.popnpop_kotlin.ui.common.layout

import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DefaultLayout(
    title: String,
    body: @Composable ()-> Unit
){
    Scaffold {
        AppBar(title = title)
        BottomAppBar {

        }
    }
}
