package com.hutsy.group.notes.ui

import androidx.compose.ui.graphics.Color

object NotesRepository {
    val dummyData = listOf(
        Note(
            title = "UI concepts worth existing",
            description = "Lorem Ipsum, sometimes referred to as 'lipsum', is the placeholder text used in design when creating content. It helps designers plan out where the content will sit, without needing to wait for the content to be written and approved.",
            color = Color.Green
        ),
        Note(
            title = "Book Review : The Design of Everyday Things by Don Norman",
            description = "A book review is a thorough description, critical analysis, and/or evaluation of the quality, meaning, and significance of a book, often written in relation to prior research on the topic.",
            color = Color.LightGray
        ),
        Note(
            title = "Animes produced by Ufotable",
            description = "Ufotable, Inc is a Japanese animation studio founded in October 2000 by former Telecom Animation Film producer Hikaru Kondō and located in Suginami, Tokyo.",
            color = Color.Yellow
        ),
        Note(
            title = "Mangas planned to read",
            description = "noun. man·\u200Bga ˈmäŋ-gə plural manga also mangas. : Japanese comic books and graphic novels considered collectively as a genre.",
            color = Color.LightGray
        ),
        Note(
            title = "Sam Altman kicked out of OpenAI?",
            description = "The dismissal followed what the company said was a “deliberative review process by the board, which concluded that he was not consistently candid in his communications with the board, hindering its ability to exercise its responsibilities.",
            color = Color.Gray
        ),
        Note(
            title = "List of free & open source apps",
            description = "F-Droid is an installable catalogue of FOSS (Free and Open Source Software) applications for the Android platform. The client makes it easy to browse, install, and keep track of updates on your device.",
            color = Color.Yellow
        ),
        Note(
            title = "Wednesday : Commit to Github on the homeScreen Branch",
            description = "Sample description",
            color = Color.Green
        ),
        Note(
            title = "Thursday : Present on kotlin Booleans",
            description = "Sample description",
            color = Color.LightGray
        )

    )
}