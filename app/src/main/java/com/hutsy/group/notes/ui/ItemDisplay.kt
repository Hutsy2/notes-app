package com.hutsy.group.notes.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemDisplay(
    modifier: Modifier = Modifier,
    onCardClick: () -> Unit,
    note: Note,
) {
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 4.dp, vertical = 2.dp)
            .sizeIn(minHeight = 80.dp),
        colors = CardDefaults.cardColors(
            note.color
        ),
        onClick = onCardClick
    )
    {

        Column(
            modifier = Modifier.padding(8.dp)
        ) {
            Text(
                text = note.title,
                style = MaterialTheme.typography.displayMedium,
                modifier = Modifier.padding(bottom = 8.dp)

            )
            note.description?.let {
                Text(
                    text = it,
                    maxLines = 1,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    overflow = TextOverflow.Ellipsis,
                    style = MaterialTheme.typography.bodyMedium

                )
            }
        }

    }
}

//@Preview
//@Composable
//fun ItemDisplayPreview() {
//    NotesTheme {
//        ItemDisplay(note = NotesRepository.dummyData[3], onCardClick = true, selected = false)
//    }
//}