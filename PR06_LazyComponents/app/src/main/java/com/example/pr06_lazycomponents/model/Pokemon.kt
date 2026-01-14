package com.example.pr06_lazycomponents.model

import androidx.annotation.DrawableRes

data class Pokemon(
    var name: String,
    var type: String,
    @DrawableRes var image: Int,
    val stats: PokemonStats,
    val moves: List<String>,
    val weaknesses: List<String>
)

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
