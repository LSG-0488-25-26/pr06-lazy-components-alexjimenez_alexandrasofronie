package com.example.pr06_lazycomponents.model

import androidx.annotation.DrawableRes

//Data class de cada Pokemon
data class Pokemon(
    var name: String,
    var type: String,
    @DrawableRes var image: Int,
    val stats: PokemonStats
)

//Estadisticas de cada Pokemon
data class PokemonStats(
    val hp: Int,
    val attack: Int,
    val defense: Int,
    val spAttack: Int,
    val spDefense: Int,
    val speed: Int
) {
    val total: Int get() = hp + attack + defense + spAttack + spDefense + speed
}
