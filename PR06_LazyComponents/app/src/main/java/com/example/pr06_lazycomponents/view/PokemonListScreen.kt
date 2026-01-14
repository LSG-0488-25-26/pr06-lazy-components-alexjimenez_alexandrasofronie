package com.example.pr06_lazycomponents.view

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pr06_lazycomponents.model.Pokemon
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme

@Composable
fun PokemonListScreen(
    onPokemonClick: (Pokemon) -> Unit
) {
    Column {
        Text(
            text = "Pokédex",
            style = MaterialTheme.typography.headlineLarge,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        )
    }
}