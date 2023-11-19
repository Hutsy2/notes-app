package com.hutsy.group.notes.ui

import android.text.style.StyleSpan
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hutsy.group.notes.ui.theme.NotesTheme


@Composable
fun ItemDisplay(
    modifier: Modifier = Modifier,
    note: Note,

    ) {
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 4.dp, vertical = 2.dp)
            .sizeIn(minHeight = 80.dp),
        colors = CardDefaults.cardColors(note.color)
    )
    {
        Column(
            modifier = Modifier.padding(8.dp)
        ) {
            Text(
                text = note.title,
                style =MaterialTheme.typography.displayMedium
            )
        }

    }
}

@Preview
@Composable
fun ItemDisplayPreview() {
    NotesTheme {
        ItemDisplay(note = NotesRepository.dummyData[3])
    }
}