package com.example.pr06_lazycomponents.view.components

import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.pr06_lazycomponents.model.Pokemon

//función para añadir un borde de color a cad card en funcion de su tipo
fun getTypeColor(type: String): Color {
    return when (type.lowercase()) {
        "grass" -> Color(0xFF78C850)      // Verde
        "fire" -> Color(0xFFF08030)       // Rojo/Naranja
        "water" -> Color(0xFF6890F0)      // Azul
        "electric" -> Color(0xFFF8D030)   // Amarillo
        "poison" -> Color(0xFFA040A0)     // Morado
        "normal" -> Color(0xFFA8A878)     // Beige
        "fairy" -> Color(0xFFEE99AC)      // Rosa
        "rock" -> Color(0xFFB8A038)       // Marrón
        "flying" -> Color(0xFFA890F0)     // Azul claro
        "fighting" -> Color(0xFFC03028)   // Rojo oscuro
        "psychic" -> Color(0xFFF85888)    // Rosa fuerte
        "bug" -> Color(0xFFA8B820)        // Verde lima
        "ghost" -> Color(0xFF705898)      // Morado oscuro
        "steel" -> Color(0xFFB8B8D0)      // Gris
        "ice" -> Color(0xFF98D8D8)        // Celeste
        "dragon" -> Color(0xFF7038F8)     // Morado intenso
        "dark" -> Color(0xFF705848)       // Marrón oscuro
        "ground" -> Color(0xFFE0C068)     // Amarillo tierra
        else -> Color.Gray                       // Color por defecto
    }
}

@Composable
fun PokemonItem(
    pokemon: Pokemon,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick),
        border = BorderStroke(3.dp, getTypeColor(pokemon.type))

    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = pokemon.image),
                contentDescription = "Imagen de ${pokemon.name}",
                modifier = Modifier.size(80.dp)
            )

            Spacer(modifier = Modifier.width(16.dp))

            Column {
                Text(
                    text = pokemon.name,
                    style = MaterialTheme.typography.headlineSmall,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Tipo: ${pokemon.type}",
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }
}