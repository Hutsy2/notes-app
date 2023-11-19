package com.hutsy.group.notes.ui

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import java.util.UUID

class MainViewModel : ViewModel() {
    val notes = mutableStateListOf<Note>()
    val Data = mutableStateListOf<NotesRepository>()

    fun addNote(
        note: Note,
    ) {
        var existingNote: Note? = null
        val noteExists = notes.any {
            existingNote = it
            it.id == note.id
        }
        if (noteExists) {
            // Just a simple logic for updating the notes
            notes.remove(existingNote)
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
    val color: Color
)

