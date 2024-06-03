package com.mobile.popnpop_kotlin.ui.common.layout

import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun BottomNavigationBar() {
    BottomAppBar {
        // Add BottomNavigationItems here
        Row(selected = true, onClick = { /* Handle click */ }) {
            Icon(Icons.Default.Home, contentDescription = "Home")
            Text(text = "Home")
        }
        BottomNavigationItem(selected = false, onClick = { /* Handle click */ }) {
            Icon(Icons.Default.Search, contentDescription = "Search")
            Text(text = "Search")
        }
        BottomNavigationItem(selected = false, onClick = { /* Handle click */ }) {
            Icon(Icons.Default.Settings, contentDescription = "Settings")
            Text(text = "Settings")
        }
    }
}

