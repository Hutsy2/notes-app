package com.hutsy.group.notes.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.hutsy.group.notes.ui.theme.NotesTheme

@Composable
fun NoteContent(
    onBackButtonClicked: () -> Unit,
    onEditButtonClicked: () -> Unit,
    modifier: Modifier = Modifier,
    title: String,
    description: String
) {
    Column(
        modifier = modifier
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        )
        {
            Row(
                modifier = Modifier,
                horizontalArrangement = Arrangement.Start
            ) {
                IconButton(
                    onClick = onBackButtonClicked,
                    modifier = Modifier
                        .padding(16.dp)
                        .size(width = 20.dp, height = 20.dp)
                        .background(
//                            MaterialTheme.colorScheme.surface,
                            color = Color.Green,
                            shape = RoundedCornerShape(12.dp)
                        ),

                    ) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Back",
                        Modifier.size(24.dp),
                        tint = Color.Black
                    )
                }
            }

            Row(
                modifier = Modifier,
                horizontalArrangement = Arrangement.End
            ) {
                IconButton(
                    onClick = onEditButtonClicked,
                    modifier = Modifier
                        .padding(16.dp)
                        .size(width = 20.dp, height = 20.dp)
                        .background(
//                            MaterialTheme.colorScheme.surface,
                            shape = RoundedCornerShape(12.dp),
                            color = Color.Green
                        ),
                ) {
                    Icon(
                        imageVector = Icons.Default.Edit,
                        contentDescription = "Back",
                        Modifier.size(24.dp),
                        tint = Color.Black
                    )
                }
            }


        }
        Text(
            text = title,
            style = MaterialTheme.typography.titleLarge,
            color = MaterialTheme.colorScheme.outline,
            modifier = Modifier
                .padding(
                    top = 12.dp,
                    bottom = 16.dp
                ),
            textAlign = TextAlign.Left,
            letterSpacing = TextUnit.Unspecified,
        )
        Text(
            text = description,
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
        )
    }
}

@Preview
@Composable
fun ItemPreview() {
    NotesTheme {
        NoteContent(
            onBackButtonClicked = { },
            onEditButtonClicked = {},
            title = "Sila Elijah Maithya",
            description = "Navigation rail is another navigation component by material design which allows compact navigation options for primary destinations to be accessible from the side of the app."
        )
    }
}

