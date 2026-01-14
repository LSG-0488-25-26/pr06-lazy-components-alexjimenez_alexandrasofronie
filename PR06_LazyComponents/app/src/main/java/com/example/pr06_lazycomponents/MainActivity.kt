package com.example.pr06_lazycomponents

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.pr06_lazycomponents.model.Pokemon
import com.example.pr06_lazycomponents.ui.theme.PR06_LazyComponentsTheme
import com.example.pr06_lazycomponents.view.PokemonDetailScreen
import com.example.pr06_lazycomponents.view.PokemonListScreen
import com.example.pr06_lazycomponents.viewmodel.PokemonViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PR06_LazyComponentsTheme {
                PokemonApp()
            }
        }
    }
}

@Composable
fun PokemonApp() {
    val showDetail = remember { mutableStateOf(false) }
    val selectedPokemon = remember { mutableStateOf<Pokemon?>(null) }
    if (!showDetail.value) {
        PokemonListScreen(
            onPokemonClick = { pokemon ->
                selectedPokemon.value = pokemon
                showDetail.value = true
            }
        )
    } else {

        val pokemon = selectedPokemon.value
        if (pokemon != null) {
            PokemonDetailScreen(
                pokemon = pokemon,
                onBackClick = {
                    showDetail.value = false
                    selectedPokemon.value = null
                }
            )
        }

    }
}