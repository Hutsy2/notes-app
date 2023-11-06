package com.hutsy.group.notes.ui

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import java.util.UUID

class MainViewModel : ViewModel() {
    val notes = mutableStateListOf<Note>()

    fun addNote(
        note: Note,
    ) {
        val noteExists = notes.any {
            it.id == note.id
        }
        if (noteExists) {
            // Just a simple logic for updating the notes
            notes.remove(note)
            notes.add(note)
        } else {
            notes.add(note)
        }
    }

    fun deleteNote(
        note: Note,
    ) {
        notes.remove(note)
    }
}

data class Note(
    val id: UUID = UUID.randomUUID(),
    val title: String,
    val description: String? = null,
)
