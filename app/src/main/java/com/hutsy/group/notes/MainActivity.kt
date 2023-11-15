package com.hutsy.group.notes

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.style.BackgroundColorSpan
import android.webkit.WebSettings.TextSize
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.hutsy.group.notes.ui.FloatingButton
import com.hutsy.group.notes.ui.HomeScreen
import com.hutsy.group.notes.ui.MainViewModel
import com.hutsy.group.notes.ui.Note
import com.hutsy.group.notes.ui.NotesRepository
import com.hutsy.group.notes.ui.theme.NotesTheme
import com.hutsy.group.notes.ui.theme.md_theme_light_background
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NotesTheme {
                isSystemInDarkTheme()
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NotesApp()
                }
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NotesApp(
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            NotesAppBar()
        },
        floatingActionButton = {
            FloatingButton()
        },
        floatingActionButtonPosition = FabPosition.End,
    ) {
        val notes = NotesRepository.dummyData
        HomeScreen(modifier = Modifier.padding(it), notes = notes)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NotesAppBar(
    modifier: Modifier = Modifier
) {
    TopAppBar(
        title = {
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .heightIn(min = 56.dp), // Ensure the minimum height is 56.dp for vertical centering
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Notes",
                    fontSize = 36.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .weight(1f) // Take up available space to center vertically
                )
                Row(
                    modifier = Modifier
                        .padding(start = 16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        modifier = Modifier.size(24.dp),
                        painter = painterResource(id = R.drawable.baseline_search_24),
                        contentDescription = null
                    )
                    Spacer(modifier = Modifier.width(16.dp))
                    Image(
                        modifier = Modifier.size(24.dp),
                        painter = painterResource(id = R.drawable.img),
                        contentDescription = null
                    )
                }
            }
        }
    )
}
