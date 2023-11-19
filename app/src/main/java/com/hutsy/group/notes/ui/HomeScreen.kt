package com.hutsy.group.notes.ui

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun HomeScreen(
    modifier: Modifier,
    notes: List<Note>,
) {
    val visibleState = remember {
        MutableTransitionState(false).apply {
            targetState = true
        }
    }

    AnimatedVisibility(
        visibleState = visibleState,
        enter = fadeIn(spring(dampingRatio = Spring.DampingRatioLowBouncy)),
        exit = fadeOut(),
        modifier = modifier
    ) {

        LazyColumn {
            itemsIndexed(notes) { index, note ->
                ItemDisplay(
                    note = note,
                    modifier = Modifier
                        .padding(horizontal = 8.dp, vertical = 4.dp)
                        .animateEnterExit(
                            enter = slideInVertically(
                                animationSpec = spring(
                                    stiffness = Spring.StiffnessVeryLow,
                                    dampingRatio = Spring.DampingRatioLowBouncy
                                ),
                                initialOffsetY = { it * (index + 1) } // staggered entrance
                            )
                        ),
                    onCardClick = {},
                )
            }
        }
    }

}

@Composable
fun FloatingButton() {
    SmallFloatingActionButton(
        onClick = { },
        shape = CircleShape,
        contentColor = Color.Black
    ) {
        Icon(Icons.Filled.Add, "Large floating action button")
    }
}
