package com.example.pr06_lazycomponents.repository

import com.example.pr06_lazycomponents.model.Pokemon
import com.example.pr06_lazycomponents.model.PokemonStats
import com.example.pr06_lazycomponents.R

class PokemonRepository {
    fun getPokemonList(): MutableList<Pokemon> {
        val pokedex: MutableList<Pokemon> = mutableListOf()

        pokedex.add(Pokemon(
            name = "Bulbasaur",
            type = "Grass",
            image = R.drawable.bulbasaur,
            stats = PokemonStats(45, 49, 49, 65, 65, 45),
            moves = listOf("Latigazo", "Drenadoras", "Rayo Solar", "Somnífero"),
            weaknesses = listOf("Fuego", "Hielo", "Volador")
        ))

        pokedex.add(Pokemon(
            name = "Charmander",
            type = "Fire",
            image = R.drawable.charmander,
            stats = PokemonStats(39, 52, 43, 60, 50, 65),
            moves = listOf("Ascuas", "Garra", "Giro Fuego", "Gruñido"),
            weaknesses = listOf("Agua", "Roca", "Tierra")
        ))

        pokedex.add(Pokemon(
            name = "Squirtle",
            type = "Water",
            image = R.drawable.squirtle,
            stats = PokemonStats(44, 48, 65, 50, 64, 43),
            moves = listOf("Pistola Agua", "Burbuja", "Refugio", "Cabezazo"),
            weaknesses = listOf("Eléctrico", "Planta")
        ))

        pokedex.add(Pokemon(
            name = "Pikachu",
            type = "Electric",
            image = R.drawable.pikachu,
            stats = PokemonStats(35, 55, 40, 50, 50, 90),
            moves = listOf("Impactrueno", "Ataque Rápido", "Onda Trueno", "Cola Férrea"),
            weaknesses = listOf("Tierra")
        ))

        pokedex.add(Pokemon(
            name = "Jigglypuff",
            type = "Fairy",
            image = R.drawable.jigglypuff,
            stats = PokemonStats(115, 45, 20, 45, 25, 20),
            moves = listOf("Canto", "Voz Cautivadora", "Danza Lluvia", "Golpe Cuerpo"),
            weaknesses = listOf("Acero", "Veneno")
        ))

        pokedex.add(Pokemon(
            name = "Meowth",
            type = "Normal",
            image = R.drawable.meowth,
            stats = PokemonStats(40, 45, 35, 40, 40, 90),
            moves = listOf("Arañazo", "Mordisco", "Golpes Furia", "Finta"),
            weaknesses = listOf("Lucha")
        ))

        pokedex.add(Pokemon(
            name = "Psyduck",
            type = "Water",
            image = R.drawable.psyduck,
            stats = PokemonStats(50, 52, 48, 65, 50, 55),
            moves = listOf("Confusión", "Hidropulso", "Ataque Rápido", "Rayos Confusión"),
            weaknesses = listOf("Eléctrico", "Planta")
        ))

        pokedex.add(Pokemon(
            name = "Golbat",
            type = "Poison",
            image = R.drawable.golbat,
            stats = PokemonStats(75, 80, 70, 65, 75, 90),
            moves = listOf("Mordisco", "Ataque Ala", "Supersónico", "Viento Aciago"),
            weaknesses = listOf("Psíquico", "Tierra")
        ))

        // Añade los demás Pokémon de la misma forma...
        pokedex.add(Pokemon(
            name = "Rattata",
            type = "Normal",
            image = R.drawable.rattata,
            stats = PokemonStats(30, 56, 35, 25, 35, 72),
            moves = listOf("Placaje", "Persecución", "Hipercolmillo", "Golpe Cabeza"),
            weaknesses = listOf("Lucha")
        ))

        pokedex.add(Pokemon(
            name = "Spearow",
            type = "Normal",
            image = R.drawable.spearow,
            stats = PokemonStats(40, 60, 30, 31, 31, 70),
            moves = listOf("Picotazo", "Ataque Ala", "Furia", "Vuelo"),
            weaknesses = listOf("Eléctrico", "Hielo", "Roca")
        ))

        pokedex.add(Pokemon(
            name = "Ekans",
            type = "Poison",
            image = R.drawable.ekans,
            stats = PokemonStats(35, 60, 44, 40, 54, 55),
            moves = listOf("Mordisco", "Ácido", "Puya Nociva", "Estrangulación"),
            weaknesses = listOf("Psíquico", "Tierra")
        ))

        pokedex.add(Pokemon(
            name = "Vulpix",
            type = "Fire",
            image = R.drawable.vulpix,
            stats = PokemonStats(38, 41, 40, 50, 65, 65),
            moves = listOf("Ascuas", "Giro Fuego", "Infierno", "Rapidez"),
            weaknesses = listOf("Agua", "Roca", "Tierra")
        ))

        pokedex.add(Pokemon(
            name = "Geodude",
            type = "Rock",
            image = R.drawable.geodude,
            stats = PokemonStats(40, 80, 100, 30, 30, 20),
            moves = listOf("Lanzarrocas", "Terremoto", "Golpe Roca", "Autodestrucción"),
            weaknesses = listOf("Agua", "Planta", "Lucha", "Tierra")
        ))

        pokedex.add(Pokemon(
            name = "Tentacruel",
            type = "Water",
            image = R.drawable.tentacruel,
            stats = PokemonStats(80, 70, 65, 80, 120, 100),
            moves = listOf("Ácido", "Rayo Burbuja", "Hidrobomba", "Tornado"),
            weaknesses = listOf("Eléctrico", "Planta")
        ))
        return pokedex
    }
}